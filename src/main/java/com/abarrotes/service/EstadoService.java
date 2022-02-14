package com.abarrotes.service;

import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.repository.interfaces.EstadoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    public void estadoGuardar(DireccionEstado estado){

        estadoDao.guardarEstado(estado);
    }

    public List<DireccionEstado> listEstadosPais(Integer idPais){

        return estadoDao.listaEstadoByPais(idPais);
    }
}
