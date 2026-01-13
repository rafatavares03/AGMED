package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.dto.UserDTO;
import com.rafatavares03.AGMED.model.entity.User;
import com.rafatavares03.AGMED.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public boolean userExists(String cpf) {
        return repository.existsById(cpf);
    }

    public User register(User user) {
        return repository.save(user);
    }

    public User getUserEntity(UserDTO dto) {
        User user = new User();
        user.setCpf(dto.getCpf());
        user.setName(dto.getName());
        user.setRole(dto.getRole());

        return user;
    }

}
