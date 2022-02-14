package com.abarrotes.controller.restcontroller;

import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("municipios/")
public class MunicipioRestController {

    @Autowired
    private MunicipioService serviceMunicipio;

    @GetMapping("buscarByEstado/{idEstado}")
    public List<DireccionMunicipio> obtenerMuncipiosByEstado(@PathVariable Integer idEstado){
        return serviceMunicipio.listaMunicipiosByEstado(idEstado);
    }
}
