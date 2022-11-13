package net.albinosistemas.estudosSpringBoot10.controllers;

import net.albinosistemas.estudosSpringBoot10.models.entities.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28,"Pedro","12345678");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id,"Maria","98554744100");
    }
}
