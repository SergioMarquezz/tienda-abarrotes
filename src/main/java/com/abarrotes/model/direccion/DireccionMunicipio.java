package com.abarrotes.model.direccion;

public class DireccionMunicipio {

    private Integer idMunicipio;
    private String municipio;
    private DireccionEstado estado;

    public DireccionMunicipio(){}

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String muncipio) {
        this.municipio = muncipio;
    }

    public DireccionEstado getEstado() {
        return estado;
    }

    public void setEstado(DireccionEstado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DireccionMunicipio{" +
                "idMunicipio=" + idMunicipio +
                ", municipio='" + municipio + '\'' +
                ", estado=" + estado +
                '}';
    }
}
