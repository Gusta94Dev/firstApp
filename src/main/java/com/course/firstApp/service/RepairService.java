package com.course.firstApp.service;

import com.course.firstApp.domain.orm.Customer;
import com.course.firstApp.domain.orm.Repair;
import com.course.firstApp.domain.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepairService {

    @Autowired
    private RepairRepository repairRepository;

    public Repair save(Repair repair) {
        return repairRepository.save(repair);
    }

    public List<Repair> findAll() {
        return repairRepository.findAll();
    }

    public Repair findById(Integer id){
        Optional<Repair> repair = repairRepository.findById(id);
        return repair.orElse (null);

    }
    public Repair update(Repair repair, Integer id) {
        Optional<Repair> foundRepair = repairRepository.findById(id);
        if (foundRepair.isPresent()) {
            repairRepository.save(repair);
        } else {
            return null;
        }

        return repair;
    }


}
