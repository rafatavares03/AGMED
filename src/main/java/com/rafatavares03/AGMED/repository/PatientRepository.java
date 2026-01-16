package com.rafatavares03.AGMED.repository;

import com.rafatavares03.AGMED.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {
}
