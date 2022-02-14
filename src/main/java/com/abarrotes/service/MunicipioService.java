package com.abarrotes.service;

import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.repository.interfaces.MunicipioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioDao daoMunicipio;

    public void guardarMunicipio(DireccionMunicipio municipio){
        daoMunicipio.saveMunicipio(municipio);
    }

    public List<DireccionMunicipio> listaMunicipiosByEstado(Integer estadoId){
        return daoMunicipio.listarMunicipiosByEstado(estadoId);
    }
}
