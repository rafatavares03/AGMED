package com.rafatavares03.AGMED.repository;

import com.rafatavares03.AGMED.model.entity.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsRepository extends JpaRepository<Credentials, String> {
}
