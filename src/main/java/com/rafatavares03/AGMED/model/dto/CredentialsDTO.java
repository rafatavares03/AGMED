package com.rafatavares03.AGMED.model.dto;

public class CredentialsDTO {
    private String cpf;
    private char[] password;

    public CredentialsDTO(){}

    public CredentialsDTO(String cpf, char[] password) {
        this.cpf = cpf;
        this.password = password;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
