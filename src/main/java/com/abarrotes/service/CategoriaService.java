package com.abarrotes.service;

import com.abarrotes.model.ProductoCategoria;
import com.abarrotes.repository.interfaces.CategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    public void guardarCategoria(ProductoCategoria categoria) {
        categoriaDao.saveCategoria(categoria);
    }

    public List<ProductoCategoria> obtenerCategorias(){

        return categoriaDao.listCategorias();
    }


}
