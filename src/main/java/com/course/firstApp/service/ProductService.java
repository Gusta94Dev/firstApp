package com.course.firstApp.service;

import com.course.firstApp.domain.orm.Customer;
import com.course.firstApp.domain.orm.Product;
import com.course.firstApp.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Integer id){
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
    public Product update(Product product, Integer id) {
        Optional<Product> foundProduct = productRepository.findById(id);
        if (foundProduct.isPresent()) {
            productRepository.save(product);
        } else {
            return null;
        }

        return product;
    }
}
