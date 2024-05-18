package za.co.chix_mart.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.chix_mart.model.entities.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceManager implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product productToUpdate) {
        Optional<Product> existingProductOptional = productRepository.findById(productToUpdate.getId());
        if (existingProductOptional.isPresent()) {
            Product existingProduct = existingProductOptional.get();
            existingProduct.setProductDescription(productToUpdate.getProductDescription());
            existingProduct.setPrice(productToUpdate.getPrice());

            productRepository.save(existingProduct);
        } else {

        }
    }
}
