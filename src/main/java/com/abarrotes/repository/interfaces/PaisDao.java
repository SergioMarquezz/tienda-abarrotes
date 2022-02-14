package com.abarrotes.repository.interfaces;

import com.abarrotes.model.direccion.DireccionPais;

import java.util.List;

public interface PaisDao {

    void paisGuardar(DireccionPais pais);
    List<DireccionPais> listPaises();
}
