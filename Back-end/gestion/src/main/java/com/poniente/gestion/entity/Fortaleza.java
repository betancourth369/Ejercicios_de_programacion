package com.poniente.gestion.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Fortaleza {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private int capacidadMaxima;
    private String ubicacion;

    @OneToMany(mappedBy = "fortaleza")
    private List<Regimiento> regimientos;
}
