package com.p.patientservice.service;

import com.p.patientservice.dto.PatientResponseDTO;
import com.p.patientservice.mapper.PatientMapper;
import com.p.patientservice.model.Patient;
import com.p.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDTO).toList();
    }

}
