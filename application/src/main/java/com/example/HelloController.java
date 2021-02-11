package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
class HelloController {

    private final MathService mathService;

    public HelloController(MathService mathService) {
        this.mathService = mathService;
    }

    @Get("/")
    public int index() {
        return mathService.addFive(10);
    }
}
