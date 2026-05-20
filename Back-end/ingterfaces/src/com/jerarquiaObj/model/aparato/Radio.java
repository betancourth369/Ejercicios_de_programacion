package com.jerarquiaObj.model.aparato;

import com.jerarquiaObj.interfaces.Hablador;

public class Radio extends Aparato implements Hablador {
    private String cassete;
    private int potencia;

    public Radio(int consumo, int precio, String cassete, int potencia) {
        super(consumo, precio);
        this.cassete = cassete;
        this.potencia = potencia;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Bedel y se hablar");
        System.out.println("Consumo: " + getConsumo() + " Precio: " + getPrecio());
        System.out.println("Cassete: " + getCassete() + " Potencia: " + getPotencia());
    }

    public String getCassete() {
        return cassete;
    }

    public void setCassete(String cassete) {
        this.cassete = cassete;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
