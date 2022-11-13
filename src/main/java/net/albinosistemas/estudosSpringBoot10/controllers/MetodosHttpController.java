package net.albinosistemas.estudosSpringBoot10.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
    @GetMapping
    public String get(){
        return "Requisição GET";
    }
    @PostMapping
    public String post(){
        return "Requisição post";
    }
    @PutMapping
    public String put(){
        return "Requisição put";
    }
    @PatchMapping
    public String path(){
        return "Requisição path";
    }
    @DeleteMapping
    public String delete(){
        return "Requisição delete";
    }

}
