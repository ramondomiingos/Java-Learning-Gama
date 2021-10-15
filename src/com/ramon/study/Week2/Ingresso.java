package com.ramon.study.Week2;

public class Ingresso {
    private float  valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Ingresso(float valor) {
        this.valor = valor;
    }
    public void imprimeValor(){
        System.out.println(this.valor);
    }
}
