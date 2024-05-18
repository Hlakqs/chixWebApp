package za.co.chix_mart.chixtwebapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import za.co.chix_mart.model.ProductService;
import za.co.chix_mart.model.ProductServiceManager;
import za.co.chix_mart.model.entities.ProductRepisitoryImpl;
import za.co.chix_mart.model.entities.ProductRepository;

@Configuration
@ComponentScan(basePackages = "za.co.chix_mart")
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepisitoryImpl();
    }
    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceManager();
    }
}
