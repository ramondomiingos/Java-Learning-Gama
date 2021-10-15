package com.ramon.study.Week2;

public class CamaroteSuperior extends  Vip{
    private String localizacao;
    private float valorAdicionalCamarote;

    public float getValorAdicionalCamarote() {
        return valorAdicionalCamarote;
    }

    public void setValorAdicionalCamarote(float valorAdicionalCamarote) {
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }



    public CamaroteSuperior(float valor, float valorAdicional, String localizacao, float valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public CamaroteSuperior(float valor, float valorAdicional, String localizacao) {
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
