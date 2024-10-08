package com.javaproject.spring_boot_search_rest_api.repository;

import com.javaproject.spring_boot_search_rest_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {


    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query,'%')" +
            "Or p.description LIKE CONCAT('%',:query,'%')")
    List<Product> searchProduct(String query);
}
