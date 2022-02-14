package com.abarrotes.repository;

import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.repository.interfaces.EstadoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstadoDaoImpl implements EstadoDao {

    @Autowired
    private DaoJdbcCall jdbcCall;

    @Override
    public void guardarEstado(DireccionEstado estado) {
        jdbcCall.guardarEstado(estado);
    }

    @Override
    public List<DireccionEstado> listaEstadoByPais(Integer idPais) {
        return jdbcCall.estadosByPaisLista(idPais);
    }
}
