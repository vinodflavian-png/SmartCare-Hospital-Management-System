package com.example.smartcare_hospital_ms.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.security.PrivateKey;

@Entity
public class Patient {
    @Id
    private int id;
    private String p_name;
    private String Address;

}
