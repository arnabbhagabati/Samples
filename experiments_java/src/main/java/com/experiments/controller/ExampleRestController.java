package com.experiments.controller;

import com.experiments.main.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class ExampleRestController {

    @Autowired
    MyProperties properties;

    @GetMapping("/users")
    public Map<String, String> getEmployees(){
        Map<String, String> users = properties.getUsers();
        return users;
    }
}
