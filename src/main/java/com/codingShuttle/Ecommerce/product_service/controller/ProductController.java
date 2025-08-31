package com.codingShuttle.Ecommerce.product_service.controller;

import com.codingShuttle.Ecommerce.product_service.entity.Product;
import com.codingShuttle.Ecommerce.product_service.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return "Product has been created";
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
