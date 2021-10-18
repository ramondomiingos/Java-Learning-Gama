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

    @Test
    void verificarSexoDoAssistente(){
        Assistente assis = new Assistente("Ramon Assistente", 'm', "Tecnoliga", 1234556 );
        assertEquals('M',assis.getSexo() );
    }

    @Test
    void verificaNomeDoAssistente(){
        Assistente assis = new Assistente("Ramon Assistente", 'm', "Tecnoliga", 1234556 );
        assertEquals("Ramon Assistente",assis.getNome() );

    }
    @Test
    void verificaDepartamentoDoAssistente(){
        Assistente assis = new Assistente("Ramon Assistente", 'm', "Tecnoliga", 1234556 );
        assertEquals("Tecnoliga",assis.getDepartamento() );

    }
}