package com.abarrotes.model;

public class ProductoCategoria {

    private Integer idCategoria;
    private String categoria;

   public ProductoCategoria(){}


    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ProductoCategoria{" +
                "idCategoria=" + idCategoria +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
