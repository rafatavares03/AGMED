package com.rafatavares03.AGMED.model.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
    @Id
    private String cpf;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String role;

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
}
