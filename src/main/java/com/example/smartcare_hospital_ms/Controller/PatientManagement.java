package com.example.smartcare_hospital_ms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientManagement {

    @GetMapping("/list")
    public String getPatient(){
        return "student list";
    }

    @PostMapping("/add")
    public String addPatient(){
        return "Student added";
    }
}
