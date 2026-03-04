package com.p.patientservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientResponseDTO {
    private String id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String email;
}
