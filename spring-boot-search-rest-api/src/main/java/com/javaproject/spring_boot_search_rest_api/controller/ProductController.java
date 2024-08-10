package com.javaproject.spring_boot_search_rest_api.controller;

import com.javaproject.spring_boot_search_rest_api.entity.Product;
import com.javaproject.spring_boot_search_rest_api.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;


    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
