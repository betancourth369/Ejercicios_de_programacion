package com.poniente.gestion.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GranCasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String lema;
    private String region;

    @OneToMany(mappedBy = "granCasa")
    private List<CasaVasalla> casasVasallas;
}
