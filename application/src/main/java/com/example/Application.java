package com.example;

import io.micronaut.context.annotation.Factory;
import io.micronaut.runtime.Micronaut;

import javax.inject.Singleton;

@Factory
class Application {

    @Singleton
    public MathService mathService() {
        System.out.println("MathService");
        return new MathService();
    }

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
