package com.course.firstApp.service;

import com.course.firstApp.domain.orm.Address;
import com.course.firstApp.domain.orm.Customer;
import com.course.firstApp.domain.repository.AddressRepository;
import com.course.firstApp.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Integer id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.orElse(null);
    }

    public Address update(Address address, Integer id) {
        Optional<Address> foundAddress = addressRepository.findById(id);
        if (foundAddress.isPresent()) {
            addressRepository.save(address);
        } else {
            return null;
        }

        return address;
    }
}
