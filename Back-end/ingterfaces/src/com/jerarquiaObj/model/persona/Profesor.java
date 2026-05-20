package com.jerarquiaObj.model.persona;

public class Profesor extends Persona{
    private String despacho;
    private String email;

    public Profesor(String nombre, int edad, String despacho, String email) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Profesor y se hablar");
        System.out.println("Nombre: " + getNombre() + " Edad: " + getEdad());
        System.out.println("Despacho: " + getDespacho() + " Email: " + getEmail());
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
