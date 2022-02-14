package com.abarrotes.repository.interfaces;

import com.abarrotes.model.direccion.DireccionEstado;

import java.util.List;

public interface EstadoDao {

    void guardarEstado(DireccionEstado estado);
    List<DireccionEstado> listaEstadoByPais(Integer idPais);
}
