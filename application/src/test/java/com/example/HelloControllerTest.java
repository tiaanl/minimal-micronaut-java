package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class HelloControllerTest {

    private final HelloClient helloClient;

    public HelloControllerTest(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @Test
    void returnsValidResult() {
        assertNotNull(helloClient);

        int result = helloClient.index();
        assertEquals(15, result);
    }
}
