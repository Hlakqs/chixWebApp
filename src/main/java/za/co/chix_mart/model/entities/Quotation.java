package za.co.chix_mart.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private double price;
    private String productDescription;


    public Quotation() {
    }

    public Quotation(double price, String productDescription) {
        this.price = price;
        this.productDescription = productDescription;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    @Override
    public String toString() {
        return "Quotation{" +
                "productId=" + productId +
                ", price=" + price +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
