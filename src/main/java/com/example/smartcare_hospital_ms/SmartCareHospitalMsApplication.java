package com.example.smartcare_hospital_ms;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;


@SpringBootApplication
public class SmartCareHospitalMsApplication {

    static void main(String[] args) {
        SpringApplication.run(SmartCareHospitalMsApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
