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
public class Maestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String especialidad;
    private int anoGraduacion;

    @OneToMany
    @AssociationOverride(name = "id.maestre",
            joinColumns = @JoinColumn(name = "maestre_id") )
    private List<Recaudacion> recaudaciones;
}
