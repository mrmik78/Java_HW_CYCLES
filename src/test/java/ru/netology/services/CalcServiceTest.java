package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.CalcService;

public class CalcServiceTest {
    @Test
    public void test1() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        CalcService service = new CalcService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("2. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }
}