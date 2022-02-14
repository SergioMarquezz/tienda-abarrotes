package com.abarrotes.repository;

import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.repository.interfaces.MunicipioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MunicipioDaoImpl implements MunicipioDao {

    @Autowired
    private DaoJdbcCall jdbcCall;

    @Override
    public void saveMunicipio(DireccionMunicipio municipio) {
        jdbcCall.guardarMunicipio(municipio);
    }

    @Override
    public List<DireccionMunicipio> listarMunicipiosByEstado(Integer estadoId) {
        return jdbcCall.municipiosByEstadoLista(estadoId);
    }
}
