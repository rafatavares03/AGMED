package com.rafatavares03.AGMED.model.dto;

public class DoctorRegisterDTO {
    private String cpf;
    private String name;
    private String role;
    private char[] password;
    private String crm;
    private String speciality;

    public DoctorRegisterDTO(){}

    public DoctorRegisterDTO(String cpf, String name, char[] password, String crm, String speciality) {
        this.cpf = cpf;
        this.name = name;
        this.password = password;
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

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public char[] getPassword() {
        return password;
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
