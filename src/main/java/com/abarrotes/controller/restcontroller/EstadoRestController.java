package com.abarrotes.controller.restcontroller;

import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estados/")
public class EstadoRestController {

    @Autowired
    private EstadoService serviceEstado;

    @GetMapping("buscarByPais/{id}")
    public List<DireccionEstado> obtenerEstadosPorPais(@PathVariable("id") Integer idPais){

        return serviceEstado.listEstadosPais(idPais);
    }
}
