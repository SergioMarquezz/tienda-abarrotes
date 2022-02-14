package com.abarrotes.repository.interfaces;

import com.abarrotes.model.ProductoCategoria;

import java.util.List;

public interface CategoriaDao {

    void saveCategoria(ProductoCategoria categoria);
    List<ProductoCategoria> listCategorias();

}
