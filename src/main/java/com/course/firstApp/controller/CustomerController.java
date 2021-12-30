package com.course.firstApp.controller;

import com.course.firstApp.domain.orm.Customer;
import com.course.firstApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.save(customer));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(customerService.findById(id));
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> update (@PathVariable ("id") Integer id, @RequestBody Customer customer){
        Customer result = customerService.update(customer, id);
        return ResponseEntity.ok(result);
    }
}
