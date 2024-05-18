package za.co.chix_mart.chixtwebapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;
import za.co.chix_mart.model.Product;
import za.co.chix_mart.model.ProductService;
import za.co.chix_mart.model.ProductServiceManager;
import za.co.chix_mart.model.entities.ProductRepisitoryImpl;
import za.co.chix_mart.model.entities.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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
