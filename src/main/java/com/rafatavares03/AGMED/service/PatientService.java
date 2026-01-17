package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.PatientDTO;
import com.rafatavares03.AGMED.model.entity.Patient;
import com.rafatavares03.AGMED.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public boolean patientExists(String cpf) {
        return repository.existsById(cpf);
    }

    public Patient register(Patient patient) {
        return repository.save(patient);
    }

    public Patient getPatientEntity(PatientDTO dto) {
        Patient patient = new Patient();
        patient.setCpf(dto.getCpf());
        patient.setName(dto.getName());
        patient.setAddress(dto.getAddress());
        patient.setPhoneNumber(dto.getPhoneNumber());

        return patient;
    }

}
