package com.abarrotes.controller;

import com.abarrotes.model.direccion.DireccionPais;
import com.abarrotes.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisService servicePais;

    @GetMapping("/guardar")
    public String guardaPais(){

        DireccionPais pais = new DireccionPais("Estados Unidos","US");

        servicePais.guardarPais(pais);

        return "redirect:/usuarios/";
    }
}
