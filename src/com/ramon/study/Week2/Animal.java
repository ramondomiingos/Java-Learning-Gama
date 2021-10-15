package com.ramon.study.Week2;

public class Animal {
    private  String raca;
    private String nome;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }
    public String caminha(){
        return "Caminhando!";
    }


}
