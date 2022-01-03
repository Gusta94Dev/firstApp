package com.course.firstApp.controller;


import com.course.firstApp.domain.orm.Product;
import com.course.firstApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> update (@PathVariable ("id") Integer id, @RequestBody Product product){
        Product result = productService.update(product, id);
        return ResponseEntity.ok(result);
    }
}
