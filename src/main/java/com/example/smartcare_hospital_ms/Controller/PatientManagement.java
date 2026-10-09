package com.example.smartcare_hospital_ms.Controller;

import com.example.smartcare_hospital_ms.DTO.PatientDTO;
import com.example.smartcare_hospital_ms.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/")
public class PatientManagement {
    @Autowired
    private PatientService patientService;

    @GetMapping("/getpatients")
    public List<PatientDTO> getPatient(){
                return patientService.getAllPatient();
    }

    @PostMapping("/addpatient")
    public PatientDTO addPatient(@RequestBody PatientDTO patientDTO){
        return patientService.addPatient(patientDTO);
    }
}
