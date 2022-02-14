package com.abarrotes.repository.interfaces;

import com.abarrotes.model.direccion.DireccionMunicipio;

import java.util.List;

public interface MunicipioDao {

    void saveMunicipio(DireccionMunicipio municipio);
    List<DireccionMunicipio> listarMunicipiosByEstado(Integer estadoId);
}
