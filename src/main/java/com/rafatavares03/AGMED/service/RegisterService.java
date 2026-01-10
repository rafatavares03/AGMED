package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.DoctorDTO;
import com.rafatavares03.AGMED.model.dto.DoctorRegisterDTO;
import com.rafatavares03.AGMED.model.dto.UserDTO;
import com.rafatavares03.AGMED.model.dto.UserRegisterDTO;
import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.Doctor;
import com.rafatavares03.AGMED.model.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    UserService userService;
    DoctorService doctorService;
    CredentialsService credentialsService;

    public RegisterService(UserService userService, DoctorService doctorService, CredentialsService credentialsService) {
        this.userService = userService;
        this.doctorService = doctorService;
        this.credentialsService = credentialsService;
    }

    @Transactional
    public UserDTO registerUser(UserRegisterDTO userRegisterDTO) {
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
        DoctorDTO doctorDTO = new DoctorDTO(doctorRegisterDTO.getCpf(), doctorRegisterDTO.getName(), doctorRegisterDTO.getCrm(), doctorRegisterDTO.getSpeciality());
        doctorDTO.setRole(doctorRegisterDTO.getRole());
        Doctor doctor = doctorService.getDoctorEntity(doctorDTO);
        doctor = doctorService.register(doctor);

        Credentials credentials = credentialsService.getCredentialsEntity(doctor, doctorRegisterDTO.getPassword());
        credentialsService.register(credentials);

        return doctorDTO;
    }
}
