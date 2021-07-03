package com.projectzeus.springapi.models;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="caso")
@Transactional
public class Caso implements Serializable {

    private String municipio;
    private String regiao;
    private String natureza;
    private LocalDateTime data;
    private String sexo;
    private int idade;
    private int envolvidos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public Caso() {}


    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(int envolvidos) {
        this.envolvidos = envolvidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
