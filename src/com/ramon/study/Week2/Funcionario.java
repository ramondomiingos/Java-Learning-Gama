package com.ramon.study.Week2;

public class Funcionario extends  Pessoa {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario(String nome, char sexo, String departamento ) {
        super(nome,sexo);
        this.departamento = departamento;
    }

    public void exibeDados(){
        System.out.println("Nome:" +this.nome +
                "\nSexo:" + ( Character.toUpperCase(this.sexo)  == 'M'? "Masculino" : "Feminino" ) );
    }
}
