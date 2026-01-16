package com.rafatavares03.AGMED.model.dto;

public class PatientDTO {
    String cpf;
    String name;
    String address;
    String phoneNumber;

    public PatientDTO(){}

    public PatientDTO(String cpf, String name, String address, String phoneNumber) {
        this.cpf = cpf;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
