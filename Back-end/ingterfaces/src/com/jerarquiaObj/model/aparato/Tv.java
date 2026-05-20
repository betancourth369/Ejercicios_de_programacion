package com.jerarquiaObj.model.aparato;

import com.jerarquiaObj.interfaces.Hablador;

public class Tv extends Aparato implements Hablador {
    private String teletexto;
    private int pulgadas;

    public Tv(int consumo, int precio, String teletexto, int pulgadas) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.pulgadas = pulgadas;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Tv y se hablar");
        System.out.println("Consumo: " + getConsumo() + " Precio: " + getPrecio());
        System.out.println("Teletexto: " + getTeletexto() + " Pulgadas: " + getPulgadas());
    }

    public String getTeletexto() {
        return teletexto;
    }

    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
