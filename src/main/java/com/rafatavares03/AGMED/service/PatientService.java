package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.repository.PatientRepository;

public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }


}
