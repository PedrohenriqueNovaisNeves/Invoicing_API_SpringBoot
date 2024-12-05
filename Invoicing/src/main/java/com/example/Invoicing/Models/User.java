package com.example.Invoicing.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUser;
    private String name;
    private String CPF;
    private String RG;
    private String email;

    public void setIdUser(UUID idUser){
        this.idUser = idUser;
    }

    public void setNameUser(String name){
        this.name = name;
    }

    public void setCPF(String cpf){
        this.CPF = cpf;
    }

    public void setRg(String RG){
        this.RG = RG;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public UUID getIdUser(){
        return idUser;
    }

    public String getNameUser(){

    }
}
