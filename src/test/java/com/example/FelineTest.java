package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class FelineTest {


    //Проверяем принадлежность к семейству
    @Test
    public void getFamilyForFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    //Проверяем колличество котят
    @Test
    public void getKittensForFeline() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }

    //Проверяем, что семейство кошачих ест мясо
    @Test
    public void predatorShouldEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}