package com.abarrotes.controller.restcontroller;

import com.abarrotes.model.direccion.DireccionColonia;
import com.abarrotes.service.ColoniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("colonias/")
public class ColoniaRestController {

    @Autowired
    private ColoniaService serviceColonia;

    @GetMapping("buscarByMuncipio/{idMunicipio}")
    public List<DireccionColonia> buscarColoniasByMunicipio(@PathVariable Integer idMunicipio){
        return serviceColonia.obtenerColoniasByMunicipio(idMunicipio);
    }
}
