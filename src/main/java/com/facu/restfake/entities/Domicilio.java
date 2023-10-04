package com.facu.restfake.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends Base{

    private String calle;

    private int numero;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "localidad_id")
    private Localidad localidad;
}
