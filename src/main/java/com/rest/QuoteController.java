package com.rest;

import io.micronaut.http.annotation.*;

@Controller("/quote")
public class QuoteController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}