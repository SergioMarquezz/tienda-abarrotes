package com.abarrotes.model.direccion;

public class DireccionPais {

    private Integer idPais;
    private String pais;
    private String abreviatura;

    public DireccionPais(){}

    public DireccionPais(String pais, String abreviatura) {

        this.pais = pais;
        this.abreviatura = abreviatura;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    @Override
    public String toString() {
        return "DireccionPais{" +
                "idPais=" + idPais +
                ", pais='" + pais + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                '}';
    }
}
