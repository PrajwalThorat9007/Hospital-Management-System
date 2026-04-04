package com.spring.hospitalmanagementsystem.controller;

import com.spring.hospitalmanagementsystem.entity.Patient;
import com.spring.hospitalmanagementsystem.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // CREATE
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    // READ ALL
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable int id,
                                 @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
        return "Patient deleted successfully";
    }
}