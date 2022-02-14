package com.abarrotes.model.direccion;


public class DireccionEstado{

    private Integer idEstado;
    private String estado;
    private DireccionPais pais;

    public DireccionEstado(){}

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DireccionPais getPais() {
        return pais;
    }

    public void setPais(DireccionPais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "DireccionEstado{" +
                "idEstado=" + idEstado +
                ", estado='" + estado + '\'' +
                ", pais=" + pais +
                '}';
    }
}
