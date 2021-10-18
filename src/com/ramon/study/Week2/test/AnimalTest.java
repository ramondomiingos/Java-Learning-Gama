package com.ramon.study.Week2.test;

import com.ramon.study.Week2.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void SetarNomedoAnimal(){
        Animal animalzinho = new Animal("Tobias" );
        assertEquals("Tobias",animalzinho.getNome());
    }

    @Test
    void testSetEGetRaca() {
        Animal animalzinho = new Animal("Tobias" );
        animalzinho.setRaca("Beagle");
        assertEquals("Beagle",animalzinho.getRaca());
    }


    @Test
    void testAnimalCaminhando() {
        Animal animalzinho = new Animal("Tobias" );
        assertEquals("Caminhando!",animalzinho.caminha());

    }
}