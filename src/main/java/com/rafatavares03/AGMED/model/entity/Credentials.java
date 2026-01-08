package com.rafatavares03.AGMED.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "credentials")
public class Credentials {
    @Id
    private String cpf;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cpf")
    private User user;

    @Column(nullable = false)
    private char[] password;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
