package com.rafatavares03.AGMED.repository;

import com.rafatavares03.AGMED.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
