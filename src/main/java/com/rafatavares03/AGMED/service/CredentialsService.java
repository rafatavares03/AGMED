package com.rafatavares03.AGMED.service;

import com.rafatavares03.AGMED.model.entity.Credentials;
import com.rafatavares03.AGMED.model.entity.User;
import com.rafatavares03.AGMED.repository.CredentialsRepository;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService {
    private final CredentialsRepository repository;

    public CredentialsService(CredentialsRepository repository) {
        this.repository = repository;
    }

    public Credentials getCredentialsEntity(User user, char[] password) {
        Credentials credentials = new Credentials();
        credentials.setUser(user);
        credentials.setPassword(password);

        return credentials;
    }

    public Credentials register(Credentials credentials) {
        return repository.save(credentials);
    }
}
