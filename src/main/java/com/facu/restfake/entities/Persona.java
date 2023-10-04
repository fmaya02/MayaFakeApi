package com.facu.restfake.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona extends Base{

    private String nombre;

    private String apellido;

    private int dni;

    @OneToMany (orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<>();

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "domicilio_id")
    private Domicilio domicilio;

    public void addLibro (Libro libro){
        libros.add(libro);
    }
}
