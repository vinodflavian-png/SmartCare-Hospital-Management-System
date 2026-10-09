package com.example.smartcare_hospital_ms.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    @Id
    private int id;
    private String p_name;
    private String Address;

}
