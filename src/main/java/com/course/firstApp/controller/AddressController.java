package com.course.firstApp.controller;

import com.course.firstApp.domain.orm.Address;
import com.course.firstApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addresses")
    public ResponseEntity<Address> save(@RequestBody Address address){
        return ResponseEntity.ok(addressService.save(address));
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<Address>> findAll(){
        return ResponseEntity.ok(addressService.findAll());
    }

    @GetMapping("/addresses/{id}")
    public ResponseEntity<Address> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(addressService.findById(id));
    }

    @PutMapping("/addresses/{id}")
    public ResponseEntity<Address> update (@PathVariable ("id") Integer id, @RequestBody Address address){
        Address result = addressService.update(address, id);
        return ResponseEntity.ok(result);
    }
}
