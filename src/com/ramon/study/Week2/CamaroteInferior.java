package com.ramon.study.Week2;

public class CamaroteInferior extends  Vip{
    private String localizacao;

    public CamaroteInferior(float valor, float valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
