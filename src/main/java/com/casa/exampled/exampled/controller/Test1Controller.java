package com.casa.exampled.exampled.controller;

import com.casa.exampled.exampled.entity.Test1;
import com.casa.exampled.exampled.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Test1Controller {

    @Autowired
    private Test1Service service;

    @PostMapping("/test1")
    public ResponseEntity<Test1> save(@RequestBody Test1 test) {
        return ResponseEntity.ok(service.save(test));
    }

    @GetMapping("/test1/{s}")
    public ResponseEntity<List<Test1>> get(@PathVariable("s") String s) {
        return ResponseEntity.ok(service.findByString(s));
    }

    @GetMapping("test1")
    public ResponseEntity<List<Test1>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
