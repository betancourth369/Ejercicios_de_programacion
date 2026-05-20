package com.jerarquiaObj.model.ave;

import com.jerarquiaObj.interfaces.Hablador;

public class Piolin extends Canario implements Hablador {
    private int numPeliculas;

    public Piolin(String sexo, int edad, boolean canta, int numPeliculas) {
        super(sexo, edad, canta);
        this.numPeliculas = numPeliculas;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Piolin y se hablar");
        System.out.println("Sexo: " + getSexo() + " Edad: " + getEdad());
        System.out.println("Canta: " + isCanta() + " NºPeliculas: " + getNumPeliculas());
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }
}
