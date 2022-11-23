package studio.irfan.linkedinspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import studio.irfan.linkedinspring.data.Product;
import studio.irfan.linkedinspring.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    List<Product> getAllProducts() {
        System.out.println("Request");
        return productService.getProducts(0, 5);
    }
}
