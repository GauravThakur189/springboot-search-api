package com.javaproject.spring_boot_search_rest_api.service.impl;

import com.javaproject.spring_boot_search_rest_api.entity.Product;
import com.javaproject.spring_boot_search_rest_api.repository.ProductRepository;
import com.javaproject.spring_boot_search_rest_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {
      List<Product> products =productRepository.searchProduct(query);
      return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
