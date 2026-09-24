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
public class CasaVasalla {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String sede;
    private int nivelLealtad;

    @ManyToOne
    @JoinColumn(name = "gran_casa_id")
    private GranCasa granCasa;

    @OneToMany(mappedBy = "casaVasalla")
    private List<Regimiento> regimientos;
}
