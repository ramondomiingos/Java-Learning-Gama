package com.ramon.study.Week2;

public class Assistente extends Funcionario {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Assistente(String nome, char sexo, String departamento, int matricula) {
        super(nome, sexo, departamento);
        this.matricula = matricula;
    }
    public void exibeDados(){
        System.out.println("Nome:" +this.nome +
                "\nSexo:" + ( Character.toUpperCase(this.sexo)  == 'M'? "Masculino" : "Feminino" ) +
                "\nMatricula:"+this.matricula);
    }
}
