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
public class GranCasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String lema;
    private String region;

    @OneToMany(mappedBy = "granCasa")
    private List<CasaVasalla> casasVasallas;

    @OneToMany
    @AssociationOverride(name = "id.granCasa",
    joinColumns = @JoinColumn(name = "gran_casa_id") )
    private List<Recaudacion> recaudaciones;
}
