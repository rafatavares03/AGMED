package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.UserDTO;
import com.rafatavares03.AGMED.model.dto.UserRegisterDTO;
import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    CredentialsService credentialsService;
    UserService userService;

    public RegisterService(UserService userService, CredentialsService credentialsService) {
        this.userService = userService;
        this.credentialsService = credentialsService;
    }

    @Transactional
    public void registerUser(UserRegisterDTO userRegisterDTO) {
        UserDTO userDTO = new UserDTO(userRegisterDTO.getCpf(), userRegisterDTO.getName());
        userDTO.setRole(userRegisterDTO.getRole());

        User user = userService.getUserEntity(userDTO);
        user = userService.register(user);

        Credentials credentials = credentialsService.getCredentialsEntity(user, userRegisterDTO.getPassword());
        credentialsService.register(credentials);
    }
}
