package com.ramon.study.Week2.test;

import com.ramon.study.Week2.CamaroteInferior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamaroteInferiorTest {

    @Test
    void LocalizacaoDoCamarote() {
        CamaroteInferior camarote = new CamaroteInferior(125,50,"ab12");
        assertEquals("ab12", camarote.getLocalizacao());
    }


}