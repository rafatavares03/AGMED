package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.DoctorDTO;
import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.Doctor;
import com.rafatavares03.AGMED.repository.CredentialsRepository;
import com.rafatavares03.AGMED.repository.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

/*
@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final CredentialsRepository credentialsRepository;

    public DoctorService(DoctorRepository doctorRepository, CredentialsRepository credentialsRepository) {
        this.doctorRepository = doctorRepository;
        this.credentialsRepository = credentialsRepository;
    }

    @Transactional
    public void register(DoctorDTO dto, char[] password) {
        Doctor doctor = new Doctor();
        doctor.setName(dto.getName());
        doctor.setCpf(dto.getCpf());
        doctor.setCrm(dto.getCrm());
        doctor.setSpeciality(dto.getSpeciality());

        Credentials credentials = new Credentials();
        credentials.setCpf(dto.getCpf());
        credentials.setPassword(password);

        doctorRepository.save(doctor);
        credentialsRepository.save(credentials);
    }
}
*/
