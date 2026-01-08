package com.rafatavares03.AGMED.model.dto;

import com.rafatavares03.AGMED.model.entity.Doctor;

public class DoctorDTO {
    String cpf;
    String name;
    String crm;
    String speciality;

    DoctorDTO() {}

    DoctorDTO(String cpf, String name, String crm, String speciality) {
        this.cpf = cpf;
        this.name = name;
        this.crm = crm;
        this.speciality = speciality;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
