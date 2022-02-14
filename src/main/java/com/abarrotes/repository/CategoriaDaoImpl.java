package com.abarrotes.repository;

import com.abarrotes.model.ProductoCategoria;
import com.abarrotes.repository.interfaces.CategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaDaoImpl implements CategoriaDao {

    @Autowired
    private DaoJdbcCall jdbcCall;

    @Override
    public void saveCategoria(ProductoCategoria categoria) {
        jdbcCall.categoriaGuardar(categoria);
    }

    @Override
    public List<ProductoCategoria> listCategorias() {

        return jdbcCall.listarCategorias();
    }
}
