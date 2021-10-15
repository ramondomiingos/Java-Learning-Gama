package com.ramon.study.Week2;

public class Tecnico extends Assistente {
    private double bonusSalario;

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(float bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public Tecnico(String nome, char sexo, String departamento, int matricula, float bonusSalario) {
        super(nome, sexo, departamento, matricula);
        this.bonusSalario = bonusSalario;
    }
    public void exibeDados(){
        System.out.println("Nome:" +this.nome +
                "\nSexo:" + ( Character.toUpperCase(this.sexo)  == 'M'? "Masculino" : "Feminino" ) +
                "\nMatricula:"+this.getMatricula() +
                "\nBonus Salarial:"+this.getBonusSalario() );
    }
}
