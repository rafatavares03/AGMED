package com.rafatavares03.AGMED.controller;

import com.rafatavares03.AGMED.model.dto.DoctorDTO;
import com.rafatavares03.AGMED.model.dto.DoctorRegisterDTO;
import com.rafatavares03.AGMED.model.dto.UserDTO;
import com.rafatavares03.AGMED.model.dto.UserRegisterDTO;
import com.rafatavares03.AGMED.service.RegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    private final RegisterService service;

    public RegisterController(RegisterService service) {
        this.service = service;
    }

    @PostMapping("/secretary")
    public ResponseEntity<UserDTO> registerSecretary(@RequestBody UserRegisterDTO user) {
        user.setRole("secretary");
        UserDTO dto = service.registerUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(dto);
    }

    @PostMapping("/doctor")
    public ResponseEntity<DoctorDTO> registerDoctor(@RequestBody DoctorRegisterDTO doctor) {
        doctor.setRole("doctor");
        DoctorDTO dto = service.registerDoctor(doctor);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(dto);
    }
}
