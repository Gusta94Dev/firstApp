package com.course.firstApp.domain.repository;

import com.course.firstApp.domain.orm.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
