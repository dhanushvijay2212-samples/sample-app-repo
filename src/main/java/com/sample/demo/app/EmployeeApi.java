package com.sample.demo.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @PostMapping("/save")
    public String createEmployee () {
        return "Employee created";
    }
}
