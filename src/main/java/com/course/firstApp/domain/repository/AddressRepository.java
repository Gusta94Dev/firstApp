package com.course.firstApp.domain.repository;

import com.course.firstApp.domain.orm.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
