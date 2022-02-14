package com.abarrotes.controller;

import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.model.direccion.DireccionPais;
import com.abarrotes.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService serviceEstado;

    @GetMapping("/guardar")
    public String saveEstado(){

        DireccionEstado estado = new DireccionEstado();
        DireccionPais pais = new DireccionPais();
        pais.setIdPais(5);
        estado.setEstado("Arizona");
        estado.setPais(pais);
      //  serviceEstado.guardarEstado(estado);
        serviceEstado.estadoGuardar(estado);

        return "redirect:/usuarios/";
    }
}
