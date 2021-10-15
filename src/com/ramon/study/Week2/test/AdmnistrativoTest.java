package com.ramon.study.Week2.test;

import com.ramon.study.Week2.Admnistrativo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdmnistrativoTest {
    @Test
   void adicionarAdicionalNoturnoEmFuncionarioDiurno(){
       Admnistrativo adm = new Admnistrativo("RamonADM",
               'm',
               "Tecnologia",
               159753, Admnistrativo.Turno.MANHA,
               158.5F );
       float valorEsperado = 0;
       assertEquals(valorEsperado,adm.getAdicionalNoturno());
   }
   @Test
    void adicionarAdicionalNoturnoEmFuncionarioNoturno(){
        Admnistrativo adm2 = new Admnistrativo("RamonADM",
                'm',
                "Tecnologia",
                159753, Admnistrativo.Turno.NOITE,
                158.5F );
        float valorEsperado = 158.5F ;
        assertEquals(valorEsperado,adm2.getAdicionalNoturno());
    }
}