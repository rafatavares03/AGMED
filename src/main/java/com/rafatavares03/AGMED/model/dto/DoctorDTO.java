package com.rafatavares03.AGMED.model.dto;

import com.rafatavares03.AGMED.model.entity.Doctor;

public class DoctorDTO {
    private String cpf;
    private String name;
    private String crm;
    private String role;
    private String speciality;

    public DoctorDTO() {}

    public DoctorDTO(String cpf, String name, String crm, String speciality) {
        this.cpf = cpf;
        this.name = name;
        this.crm = crm;
        this.speciality = speciality;
    }

    public DoctorDTO(String crm, String speciality) {
        this.crm = crm;
        this.speciality = speciality;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
