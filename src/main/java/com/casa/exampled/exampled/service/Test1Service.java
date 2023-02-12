package com.casa.exampled.exampled.service;

import com.casa.exampled.exampled.entity.Test1;
import com.casa.exampled.exampled.repository.Test1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test1Service {

    @Autowired
    private Test1_Repository repo;

    public Test1 save(Test1 test) {
        return (Test1) repo.save(test);
    }

    public List<Test1> findByString(String s) {
        return repo.findByString(s);
    }

    public List<Test1> findAll() {
        return repo.findAll();
    }
}
