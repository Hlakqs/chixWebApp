package za.co.chix_mart.chixtwebapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.chix_mart.model.Product;
import za.co.chix_mart.model.ProductService;

import java.util.List;

@Controller
public class ReservationController {

    @Autowired
    private ProductService productService;
    @GetMapping("/reservation.html")
    public String showReservationPage(Model model) {
        List<Product> products = productService.getAllProducts(); // Retrieve product data from the backend
        model.addAttribute("products", products);

        return "reservation";
    }
}
