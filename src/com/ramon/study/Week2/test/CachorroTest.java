package com.ramon.study.Week2.test;

import com.ramon.study.Week2.Cachorro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CachorroTest {

    @Test
    void VerificarLatido() {
        Cachorro doguinho = new Cachorro();
        assertEquals("AU AU!",doguinho.late());
    }
    @Test
    void verificarNomeCachorro(){
        Cachorro doguinho = new Cachorro("Alfredo");
        assertEquals("Alfredo",doguinho.getNome());
    }
}