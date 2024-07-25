package org.example.app2.controller;

import org.example.app2.entities.Data;
import org.example.app2.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class App2Controller {


    @Autowired
    private DataRepository dataRepository;
    @GetMapping("/data")
    public List<Data> getData() {
        return dataRepository.findAll();
    }
    @PostMapping("/data")
    public Data createData(@RequestBody Data data) {
        return dataRepository.save(data);
    }
}
