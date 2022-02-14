package com.abarrotes.controller;

import com.abarrotes.model.ProductoCategoria;
import com.abarrotes.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService serviceCategoria;

    @GetMapping("/guardar")
    public String saveCategorias(){

        ProductoCategoria categoria0 = new ProductoCategoria();

        categoria0.setCategoria("Bebidas");
        serviceCategoria.guardarCategoria(categoria0);
    //    System.out.println("lista"+serviceCategoria.obtenerCategorias());

        return "redirect:/usuarios/";
    }
}
