package com.rafatavares03.AGMED.repository;

import com.rafatavares03.AGMED.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
