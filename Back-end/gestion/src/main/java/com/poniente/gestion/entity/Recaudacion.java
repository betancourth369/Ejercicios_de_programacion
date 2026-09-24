package com.poniente.gestion.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Recaudacion {

    private LocalDate fecha;
    private int cantidadDragones;
    private String estadoPago;
}
