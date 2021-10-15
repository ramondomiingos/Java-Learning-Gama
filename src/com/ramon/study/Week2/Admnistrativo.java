package com.ramon.study.Week2;

public class Admnistrativo extends Assistente {
    public enum Turno  {
        MANHA, TARDE, NOITE;
    }
    private Turno turno;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private float adicionalNoturno;

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        if(this.getTurno() == Turno.NOITE){
            this.adicionalNoturno = adicionalNoturno;
        }else{
            this.adicionalNoturno = 0;
           // System.out.println(ANSI_RED+"Adicional noturno so é permitido para quem trabalha noite, o valor" +
            //        " informado no construtor  será ignorado."+ANSI_RESET);
        }

    }

    public Admnistrativo(String nome, char sexo, String departamento, int matricula, Turno turno, float adicionalNoturno) {
        super(nome, sexo, departamento, matricula);
        this.turno = turno;
        this.setAdicionalNoturno(adicionalNoturno);
    }

    public Admnistrativo(String nome, char sexo, String departamento, int matricula, Turno turno) {
        super(nome, sexo, departamento, matricula);
        this.turno = turno;
    }
    public void exibeDados(){
        System.out.println("Nome:" +this.nome +
                "\nSexo:" + ( Character.toUpperCase(this.sexo)  == 'M'? "Masculino" : "Feminino" ) +
                "\nMatricula:"+this.getMatricula() +
                "\nTurno:"+ this.getTurno()+
                (this.getTurno() == Turno.NOITE ?"\nAdicional Noturno:R$"+this.getAdicionalNoturno()  : ' ')
        );
    }
}
