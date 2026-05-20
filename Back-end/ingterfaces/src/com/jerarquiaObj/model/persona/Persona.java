package com.jerarquiaObj.model.persona;

import com.jerarquiaObj.interfaces.Hablador;

public class Persona implements Hablador {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("hola soy un " + getNombre() + " y se hablar");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
