package com.example.smartcare_hospital_ms.Service;

import com.example.smartcare_hospital_ms.DTO.PatientDTO;
import com.example.smartcare_hospital_ms.Entity.Patient;
import com.example.smartcare_hospital_ms.Repository.PatientRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<PatientDTO> getAllPatient(){
        List<Patient>patientList = patientRepo.findAll();
        return modelMapper.map(patientList, new TypeToken<List<PatientDTO>>(){}.getType());
    }
    public PatientDTO addPatient(PatientDTO patientDTO){
        patientRepo.save(modelMapper.map(patientDTO, Patient.class));
        return patientDTO;
    }
}
