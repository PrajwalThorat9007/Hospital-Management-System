package com.spring.hospitalmanagementsystem.service;

import com.spring.hospitalmanagementsystem.dto.PatientDto;
import com.spring.hospitalmanagementsystem.entity.Patient;
import com.spring.hospitalmanagementsystem.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    // Constructor Injection
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // CREATE
    public Patient addPatient(PatientDto dto) {
        Patient patient = new Patient(
                dto.getName(),
                dto.getAge(),
                dto.getGender(),
                dto.getDisease(),
                dto.getAddress(),
                dto.getPhoneNumber()
        );
        return patientRepository.save(patient);
    }


    // READ ALL
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // READ BY ID
    public Patient getPatientById(int id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // UPDATE
    public Patient updatePatient(int id, PatientDto dto) {
        Patient existing = getPatientById(id);

        existing.setName(dto.getName());
        existing.setAge(dto.getAge());
        existing.setGender(dto.getGender());
        existing.setDisease(dto.getDisease());
        existing.setAddress(dto.getAddress());
        existing.setPhoneNumber(dto.getPhoneNumber());

        return patientRepository.save(existing);
    }

    // DELETE
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }
}