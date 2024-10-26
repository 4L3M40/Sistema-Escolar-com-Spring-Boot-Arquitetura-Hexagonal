package com.senai.escola.domain;

import jakarta.persistence.*;
@Entity
@PrimaryKeyJoinColumn(name = "pessoa_id") // Define que a chave primária é herdada de Pessoa
public class Estudante extends Pessoa {
    @Column(nullable = false, unique = true, length = 50)
    private String matricula;
    // Construtores
    public Estudante() {}
    public Estudante(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }
// Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}