package com.abarrotes.controller;

import com.abarrotes.model.direccion.DireccionColonia;
import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.service.ColoniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/colonias")
public class ColoniaController {

    @Autowired
    private ColoniaService serviceColonia;

    @GetMapping("/guardar")
    public String saveColonia(){

        DireccionColonia colonia = new DireccionColonia();
        DireccionMunicipio municipio = new DireccionMunicipio();
        municipio.setIdMunicipio(9);
        colonia.setColonia("Vicente Guerrero");
        colonia.setMunicipio(municipio);

        serviceColonia.saveColonia(colonia);

        return "redirect:/usuarios/";
    }
}
