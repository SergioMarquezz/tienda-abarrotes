package com.abarrotes.model.direccion;

public class DireccionColonia {

    private Integer idColonia;
    private String colonia;
    private DireccionMunicipio municipio;

   public DireccionColonia(){}

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public DireccionMunicipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(DireccionMunicipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "DireccionColonia{" +
                "idColonia=" + idColonia +
                ", colonia='" + colonia + '\'' +
                ", municipio=" + municipio +
                '}';
    }
}
