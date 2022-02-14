package com.abarrotes.controller;

import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/municipios")
public class MunicipioController {

    @Autowired
    private MunicipioService serviceMunicipio;

    @GetMapping("/guardar")
    public String municipioGuardar(){
        DireccionMunicipio municipio = new DireccionMunicipio();
        DireccionEstado estado = new DireccionEstado();
        estado.setIdEstado(1);
        municipio.setMunicipio("Actopan");
        municipio.setEstado(estado);

        serviceMunicipio.guardarMunicipio(municipio);

        return "redirect:/usuarios/";
    }
}
