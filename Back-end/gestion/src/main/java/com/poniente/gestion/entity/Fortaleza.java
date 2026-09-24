package com.poniente.gestion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
