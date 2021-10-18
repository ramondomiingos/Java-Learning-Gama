package com.ramon.study.Week2;
import  java.util.Date;

public class Pessoa {
    String nome;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = Character.toUpperCase(sexo);
    }

    public Pessoa(String nome,  int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    char sexo;
    Date dataNascimneto;
    String endereco;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimneto() {
        return dataNascimneto;
    }

    public void setDataNascimneto(Date dataNascimneto) {
        this.dataNascimneto = dataNascimneto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
