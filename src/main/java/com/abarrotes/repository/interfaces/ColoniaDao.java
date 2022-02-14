package com.abarrotes.repository.interfaces;

import com.abarrotes.model.direccion.DireccionColonia;

import java.util.List;

public interface ColoniaDao {

    void coloniaSave(DireccionColonia colonia);
    List<DireccionColonia> listColoniasMunicipio(Integer municipioId);
}
