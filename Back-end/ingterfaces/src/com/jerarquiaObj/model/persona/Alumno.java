package com.jerarquiaObj.model.persona;

public class Alumno extends Persona{
    private String carrera;
    private int curso;

    public Alumno(String nombre,int edad, int curso, String carrera) {
        super(nombre, edad);
        this.curso = curso;
        this.carrera = carrera;
    }

    //hablador
    @Override
    public void hablar() {
        System.out.println("Hola soy un Alumno y se hablar");
        System.out.println("Nombre: " + getNombre() + " Edad: " + getEdad());
        System.out.println("Carrera: " + getCarrera() + " Curso: " + getCurso());
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
