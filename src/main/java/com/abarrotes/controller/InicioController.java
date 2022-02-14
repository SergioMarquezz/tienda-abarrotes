package com.abarrotes.controller;

import com.abarrotes.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class InicioController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/")
    public String inicio(Model model){

        model.addAttribute("listaCategorias",categoriaService.obtenerCategorias());

        return "usuario/inicio";
    }

    @GetMapping("/inicio")
    public String dashboard(){
        return "usuario/dashboard";
    }
}
