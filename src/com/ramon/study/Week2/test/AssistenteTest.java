package com.ramon.study.Week2.test;

import com.ramon.study.Week2.Assistente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistenteTest {
    @Test
    void criarAssistenteComMatricula(){
        int matricula  = 1234556;
        Assistente assis = new Assistente("Ramon Assistente", 'm', "Tecnoliga", matricula );
        assertEquals(matricula,assis.getMatricula() );
    }

}