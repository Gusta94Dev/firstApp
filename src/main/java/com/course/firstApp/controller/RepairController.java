package com.course.firstApp.controller;


import com.course.firstApp.domain.orm.Repair;
import com.course.firstApp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RepairController {

    @Autowired
    private RepairService repairService;

    @PostMapping ("/repairs")
    public ResponseEntity<Repair> save (@RequestBody Repair repair){
        return ResponseEntity.ok(repairService.save(repair));
    }

    @GetMapping("/repairs")
    public ResponseEntity<List<Repair>> findAll() {
        List<Repair> repairs = repairService.findAll();
        return ResponseEntity.ok(repairs);
    }

    @GetMapping("/repairs/{id}")
    public ResponseEntity<Repair> findById(@PathVariable("id") Integer id){
        Repair repair = repairService.findById(id);
        return ResponseEntity.ok(repair);
    }
}
