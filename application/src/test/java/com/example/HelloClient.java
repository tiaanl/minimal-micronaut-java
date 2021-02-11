package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/hello")
interface HelloClient {

    @Get("/")
    int index();
}
