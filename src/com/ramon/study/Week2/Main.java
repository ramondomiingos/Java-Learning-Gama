package com.ramon.study.Week2;

public class Main {

    public static void main(String[] args) {

        //Exercício 1:
        System.out.println("----- Funcionario---");
	Funcionario funcionario1 = new Funcionario("Ramon", 'm', "Informática");
    funcionario1.exibeDados();
        System.out.println("----- Assistente---");
    Assistente assistente1 = new Assistente("joao", 'F', "RH", 12345);
    assistente1.exibeDados();
        System.out.println("----- Tecnico---");
    Tecnico tecnico = new Tecnico(
            "RamonTec",
            'm',
            "Tecnologia",
            159753,
            205.5F) ;
        tecnico.exibeDados();
        System.out.println("----- Administrativo - Manha ---");
    Admnistrativo adm = new Admnistrativo(
            "RamonADM",
            'm',
            "Tecnologia",
            159753, Admnistrativo.Turno.MANHA,
            158.5F );
        adm.exibeDados();
        System.out.println("----- Administrativo - Noite ---");
    Admnistrativo adm2 = new Admnistrativo(
            "RamonADM2",
            'm', "Tecnologia",
            159753, Admnistrativo.Turno.NOITE,
            158.5F );
        adm2.exibeDados();
    Ingresso ingresso = new Ingresso(123.65f);
    ingresso.imprimeValor();
    Vip vip = new Vip(12f, 12.5f);
    vip.imprimeValor();
    vip.mostrarTaxas();
    CamaroteInferior camaroteInferior = new CamaroteInferior(12f,1.5f,"J67");
        System.out.println( camaroteInferior.getLocalizacao());
         camaroteInferior.imprimeValor() ;
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(
                15f,
                1,
                "A55",
                15f);
        camaroteSuperior.imprimeValor();
    }
}
