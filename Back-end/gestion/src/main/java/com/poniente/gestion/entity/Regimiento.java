package com.poniente.gestion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Regimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tipoDeTropa;
    private int soldadosActivos;
    private int costeMensual;

    @ManyToOne
    @JoinColumn(name = "casa_vasalla_id")
    private CasaVasalla casaVasalla;

    @ManyToOne
    @JoinColumn(name = "fortaleza_id")
    private Fortaleza fortaleza;
}
