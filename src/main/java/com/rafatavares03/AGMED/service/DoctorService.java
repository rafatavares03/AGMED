package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.DoctorDTO;
import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.Doctor;
import com.rafatavares03.AGMED.model.entity.User;
import com.rafatavares03.AGMED.repository.CredentialsRepository;
import com.rafatavares03.AGMED.repository.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public Doctor register(Doctor doctor) {
        return repository.save(doctor);
    }

    public Doctor getDoctorEntity(DoctorDTO dto) {
        Doctor doctor = new Doctor();
        doctor.setCpf(dto.getCpf());
        doctor.setName(dto.getName());
        doctor.setRole(dto.getRole());
        doctor.setCrm(dto.getCrm());
        doctor.setSpeciality(dto.getSpeciality());

        return doctor;
    }
}
