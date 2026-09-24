package com.poniente.gestion.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
@Embeddable
public class RecaudacionId {
    @ManyToOne
    @JoinColumn(name = "gran_casa_id")
    private GranCasa granCasa;

    @ManyToOne
    @JoinColumn(name = "maestre_id")
    private Maestre maestre;

    private LocalDate fecha;

}
