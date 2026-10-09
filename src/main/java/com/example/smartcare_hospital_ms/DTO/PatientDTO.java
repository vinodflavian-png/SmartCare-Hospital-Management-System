package com.example.smartcare_hospital_ms.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    private int id;
    private String p_name;
    private String address;
}
