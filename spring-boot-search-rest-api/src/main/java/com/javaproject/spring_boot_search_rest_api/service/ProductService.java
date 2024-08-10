package com.javaproject.spring_boot_search_rest_api.service;

import com.javaproject.spring_boot_search_rest_api.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
