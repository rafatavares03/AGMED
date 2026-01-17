package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.exception.UserAlreadyExistException;
import com.rafatavares03.AGMED.model.dto.*;
import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.Doctor;
import com.rafatavares03.AGMED.model.entity.Patient;
import com.rafatavares03.AGMED.model.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    UserService userService;
    DoctorService doctorService;
    CredentialsService credentialsService;
    PatientService patientService;

    public RegisterService(UserService userService, DoctorService doctorService, CredentialsService credentialsService, PatientService patientService) {
        this.userService = userService;
        this.doctorService = doctorService;
        this.credentialsService = credentialsService;
        this.patientService = patientService;
    }

    @Transactional
    public UserDTO registerUser(UserRegisterDTO userRegisterDTO) {
        if(userService.userExists(userRegisterDTO.getCpf())) {
            throw new UserAlreadyExistException();
        }

        UserDTO userDTO = new UserDTO(userRegisterDTO.getCpf(), userRegisterDTO.getName());
        userDTO.setRole(userRegisterDTO.getRole());

        User user = userService.getUserEntity(userDTO);
        user = userService.register(user);

        Credentials credentials = credentialsService.getCredentialsEntity(user, userRegisterDTO.getPassword());
        credentialsService.register(credentials);

        return userDTO;
    }

    @Transactional
    public DoctorDTO registerDoctor(DoctorRegisterDTO doctorRegisterDTO) {
        if(doctorService.doctorExists(doctorRegisterDTO.getCpf())) {
            throw new UserAlreadyExistException("The doctor you are trying to register is already registered.");
        }

        DoctorDTO doctorDTO = new DoctorDTO(doctorRegisterDTO.getCpf(), doctorRegisterDTO.getName(), doctorRegisterDTO.getCrm(), doctorRegisterDTO.getSpeciality());
        doctorDTO.setRole(doctorRegisterDTO.getRole());
        Doctor doctor = doctorService.getDoctorEntity(doctorDTO);
        doctor = doctorService.register(doctor);

        Credentials credentials = credentialsService.getCredentialsEntity(doctor, doctorRegisterDTO.getPassword());
        credentialsService.register(credentials);

        return doctorDTO;
    }

    public PatientDTO registerPatient(PatientDTO patientDTO) {
        if(patientService.patientExists(patientDTO.getCpf())) {
            throw new UserAlreadyExistException("This patient is already registered.");
        }

        Patient patient = patientService.getPatientEntity(patientDTO);
        patientService.register(patient);

        return patientDTO;
    }
}
