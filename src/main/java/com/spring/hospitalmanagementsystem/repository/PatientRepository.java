package com.spring.hospitalmanagementsystem.repository;

import com.spring.hospitalmanagementsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}