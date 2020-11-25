package com.clases;

import java.util.List;

public class BeneficiosCovid19 {

    private String id;
    private String nombre;
    private Float valorSubsidio;


    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }


    //Metodo que compara los dos beneficios y retorna el valor del beneficio con mayor subsidio
    public Float getMejorbeneficios(List<BeneficiosCovid19> beneficios) {

        float mejorBeneficio = beneficios.get(0).getValorSubsidio() > beneficios.get(1).getValorSubsidio()? beneficios.get(0).getValorSubsidio() : beneficios.get(1).getValorSubsidio();

        return mejorBeneficio;
    }

}
