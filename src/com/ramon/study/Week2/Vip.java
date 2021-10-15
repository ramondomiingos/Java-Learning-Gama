package com.ramon.study.Week2;

public class Vip extends  Ingresso {
    private float valorAdicional;



    public Vip(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor :R$"+(this.valorAdicional + this.getValor()));
    }
    public void mostrarTaxas(){
        System.out.println("Valor do Ingresso: R$"+ this.getValor()+
                "\n Valor Adicional VIP: R$"+this.valorAdicional );
    }
}
