package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalTest {

    //Проверяем исключения
    @Test(expected = Exception.class)
    public void getFoodWithOtherParamThrowsException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Человек");
    }

    //Проверяем какие бывают семейства
    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}

