package com.javaproject.spring_boot_search_rest_api.repository;

import com.javaproject.spring_boot_search_rest_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
