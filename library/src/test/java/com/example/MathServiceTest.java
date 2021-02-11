package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {

    @Test
    public void testAddCorrectly() {
        MathService service = new MathService();
        int result = service.add(10, 15);
        assertEquals(25, result);
    }

    @Test
    public void testCanAddFive() {
        MathService service = new MathService();
        int result = service.addFive(10);
        assertEquals(15, result);
    }
}
