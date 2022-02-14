package com.abarrotes.service;

import com.abarrotes.model.direccion.DireccionColonia;
import com.abarrotes.repository.interfaces.ColoniaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColoniaService {

    @Autowired
    private ColoniaDao daoColonia;

    public void saveColonia(DireccionColonia colonia){
        daoColonia.coloniaSave(colonia);
    }

    public List<DireccionColonia> obtenerColoniasByMunicipio(Integer idMunicipio){
        return daoColonia.listColoniasMunicipio(idMunicipio);
    }
}
