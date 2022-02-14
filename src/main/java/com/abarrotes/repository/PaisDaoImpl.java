package com.abarrotes.repository;

import com.abarrotes.model.direccion.DireccionPais;
import com.abarrotes.repository.interfaces.PaisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaisDaoImpl implements PaisDao {

    @Autowired
    private DaoJdbcCall jdbcCall;

    @Override
    public void paisGuardar(DireccionPais pais) {
       jdbcCall.paisesGuardar(pais);
    }

    @Override
    public List<DireccionPais> listPaises() {

        return jdbcCall.listarPaises();
    }
}
