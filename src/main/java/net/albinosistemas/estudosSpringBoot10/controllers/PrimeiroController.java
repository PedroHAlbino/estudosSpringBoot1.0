package net.albinosistemas.estudosSpringBoot10.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class PrimeiroController {

    @GetMapping
    public String ola() {
        return "Olá Spring Boot!";
    }
}
