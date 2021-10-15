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
}