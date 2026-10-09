package com.example.smartcare_hospital_ms.Repository;

import com.example.smartcare_hospital_ms.Entity.Patient;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
}
