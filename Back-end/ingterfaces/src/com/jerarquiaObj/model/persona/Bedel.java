package com.jerarquiaObj.model.persona;

public class Bedel extends Persona{
    private String turno;
    private int antiguedad;

    public Bedel(String nombre,int edad, String turno, int antiguedad) {
        super(nombre,edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Bedel y se hablar");
        System.out.println("Nombre: " + getNombre() + " Edad: " + getEdad());
        System.out.println("Turno: " + getTurno() + " Antiguedad: " + getAntiguedad());
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
