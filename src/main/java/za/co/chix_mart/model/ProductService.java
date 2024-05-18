package za.co.chix_mart.model;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void deleteProduct(Long id);

    void saveProduct(Product product);

    void updateProduct(Product productToUpdate);
}
