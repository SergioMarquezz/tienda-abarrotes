package com.abarrotes.controller;

import com.abarrotes.service.EstadoService;
import com.abarrotes.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private PaisService servicePais;

    @GetMapping("/")
    public String homeUsuarios(/*@PathVariable("id")*/ Integer idPais, Model model){

        model.addAttribute("listaPaises",servicePais.listaPaises());
        //List<DireccionEstado> estados = serviceEstado.listaEstado().subList(0,1);
        //model.addAttribute("listaEstados",estados);
       // System.out.println(serviceEstado.listaEstado(1));
        //serviceEstado.listEstadosPais(3);

        return "usuario/usuarios";
    }
}
