package com.abarrotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/")
    public String homeClientes(){

        return "clientes/clientes";
    }
}
