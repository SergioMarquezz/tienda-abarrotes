package com.abarrotes.service;

import com.abarrotes.model.direccion.DireccionPais;
import com.abarrotes.repository.interfaces.PaisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    private PaisDao paisDao;

    public void guardarPais(DireccionPais pais){

        paisDao.paisGuardar(pais);
    }

    public List<DireccionPais> listaPaises(){

        return paisDao.listPaises();
    }

}
