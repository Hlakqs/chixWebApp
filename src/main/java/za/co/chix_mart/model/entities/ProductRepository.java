package za.co.chix_mart.model.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.chix_mart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
