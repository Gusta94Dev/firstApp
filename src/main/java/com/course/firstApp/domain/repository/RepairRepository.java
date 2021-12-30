package com.course.firstApp.domain.repository;

import com.course.firstApp.domain.orm.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository extends JpaRepository<Repair, Integer> {
}
