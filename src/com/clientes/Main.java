package com.clientes;

import com.clases.BeneficiosCovid19;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BeneficiosCovid19 beneficios = new BeneficiosCovid19();

        List<BeneficiosCovid19> beneficiosList = new ArrayList<>();

        Main main = new Main();

        beneficios.setId(main.getIdBeneficio());
        beneficios.setNombre("Beneficiados que perdieron su trabajo por COVID19");
        beneficios.setValorSubsidio(150000F);
        beneficiosList.add(beneficios);

        beneficios = new BeneficiosCovid19();
        beneficios.setId(main.getIdBeneficio());
        beneficios.setNombre("Beneficios para persona tercera edad damnificados COVID");
        beneficios.setValorSubsidio(200000F);
        beneficiosList.add(beneficios);

        main.imprimirBeneficios(beneficiosList);

        System.out.println("El mejor beneficio es el de subsidio por valor de: $" + beneficios.getMejorbeneficios(beneficiosList));

    }


    //Metodo para imprimir la lista de beneficios
    public void imprimirBeneficios(List<BeneficiosCovid19> beneficiosCovid19) {
        Iterator<BeneficiosCovid19> iterarBeneficios = beneficiosCovid19.iterator();

        BeneficiosCovid19 beneficio;

        while (iterarBeneficios.hasNext()) {
            beneficio = (BeneficiosCovid19)iterarBeneficios.next();
            System.out.println("Id beneficio: " + beneficio.getId() + "\nDescripción beneficio: " + beneficio.getNombre() + "\nValor beneficio: " + beneficio.getValorSubsidio() + "\n ---");
        }
    }


    //Metodo que retorna un numero aletorio para el id de los beneficios
    public String getIdBeneficio(){
        //Pasamos el dato random del id a String para retornarlo
        String idBeneficio = Integer.toString((int)Math.floor(Math.random()*10000));
        return idBeneficio;
    }

}
