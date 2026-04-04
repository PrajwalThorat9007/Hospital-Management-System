package com.spring.hospitalmanagementsystem.service;

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
    public Patient addPatient(Patient patient) {
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
    public Patient updatePatient(int id, Patient updatedPatient) {
        Patient existing = getPatientById(id);

        existing.setName(updatedPatient.getName());
        existing.setAge(updatedPatient.getAge());
        existing.setGender(updatedPatient.getGender());
        existing.setDisease(updatedPatient.getDisease());
        existing.setAddress(updatedPatient.getAddress());
        existing.setPhoneNumber(updatedPatient.getPhoneNumber());

        return patientRepository.save(existing);
    }

    // DELETE
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }
}