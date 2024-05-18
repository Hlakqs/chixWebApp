package za.co.chix_mart.chixtwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.chix_mart.model.Product;
import za.co.chix_mart.model.ProductService;

import java.util.List;

@Controller
public class AdminController {

//    @Autowired
//    private PasswordEncoder passwordEncoder;

//    @Autowired
//    private SecurityConfig securityConfig;

    @Autowired
    private ProductService productService;

    @GetMapping("/admin/login")
    public String showLoginPage() {
        return "admin";
    }
//
//    @PostMapping("/admin/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        RedirectAttributes redirectAttributes) {
//
//        boolean authenticationSuccessful = true;
//
//        if (authenticationSuccessful) {
//            return "redirect:/admin/dashboard";
//        } else {
//            redirectAttributes.addAttribute("error", true);
//            return "redirect:/admin/login";
//        }
//    }

    @GetMapping("/admin/dashboard")
    public String showDashboard(Model model) {
        List<Product> products = productService.getAllProducts();

        model.addAttribute("products", products);

        return "dashboard";
    }
    @PostMapping("/admin/dashboard")
    public String handleDashboardPost(Model model, @RequestParam("name") String name, @RequestParam("price") Double price, @RequestParam("action") String action) {
        if (action.equals("add")) {
            // If action is 'add', create a new product and save it
            Product product = new Product();
            product.setProductDescription(name);
            product.setPrice(price);
            productService.saveProduct(product);
        } else if (action.equals("edit")) {
            // If action is 'edit', find the product by ID, update its details, and save it
            // You need to implement a method in your ProductService to update products
            // For now, let's assume we are updating the first product in the list
            List<Product> products = productService.getAllProducts();
            if (!products.isEmpty()) {
                Product productToUpdate = products.get(0); // Assuming we are updating the first product
                productToUpdate.setProductDescription(name);
                productToUpdate.setPrice(price);
                productService.updateProduct(productToUpdate); // Implement this method in your ProductService
            }
        } else if (action.equals("delete")) {

            List<Product> products = productService.getAllProducts();
            if (!products.isEmpty()) {
                Product productToDelete = products.get(0);
                productService.deleteProduct(productToDelete.getId());
            }
        }

        return "redirect:/admin/dashboard";
    }

    @GetMapping("/admin/logout")
    public String logout() {
        // Perform any necessary cleanup or logging out logic
        return "redirect:/admin/login?logout=true";
    }
//    @GetMapping("/admin/products")
//    public String showProducts(Model model) {
//        List<Product> products = productService.getAllProducts();
//        model.addAttribute("products", products);
//        return "product-list";
//    }

}
