package com.abarrotes.repository;

import com.abarrotes.model.direccion.DireccionColonia;
import com.abarrotes.repository.interfaces.ColoniaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColoniaDaoImpl implements ColoniaDao {

    @Autowired
    private DaoJdbcCall jdbcCall;

    @Override
    public void coloniaSave(DireccionColonia colonia) {
        jdbcCall.guardarColonia(colonia);
    }

    @Override
    public List<DireccionColonia> listColoniasMunicipio(Integer municipioId) {
        return jdbcCall.listaColoniasByMunicipio(municipioId);
    }
}
