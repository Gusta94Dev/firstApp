package com.course.firstApp.domain.repository;

import com.course.firstApp.domain.orm.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
