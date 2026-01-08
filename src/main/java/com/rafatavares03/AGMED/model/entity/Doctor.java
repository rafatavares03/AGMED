package com.rafatavares03.AGMED.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends User {
    @Column(nullable = false, unique = true)
    String crm;

    @Column(nullable = false)
    String speciality;

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}