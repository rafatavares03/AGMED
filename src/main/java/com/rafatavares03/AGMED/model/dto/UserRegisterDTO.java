package com.rafatavares03.AGMED.model.dto;

public class UserRegisterDTO {
    private String cpf;
    private String name;
    private String role;
    private char[] password;

    public UserRegisterDTO(){}

    public UserRegisterDTO(String cpf, String name, char[] password) {
        this.cpf = cpf;
        this.name = name;
        this.password = password;
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
        return this.password;
    }
}
