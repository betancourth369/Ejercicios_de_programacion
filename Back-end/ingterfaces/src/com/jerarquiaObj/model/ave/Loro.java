package com.jerarquiaObj.model.ave;

import com.jerarquiaObj.interfaces.Hablador;

public class Loro extends Ave implements Hablador {
    private String region;
    private String color;

    public Loro(String sexo, int edad, String region, String color) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Loro y se hablar");
        System.out.println("Sexo: " + getSexo() + " Edad: " + getEdad());
        System.out.println("Region: " + getRegion() + " Color: " + getColor());
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
