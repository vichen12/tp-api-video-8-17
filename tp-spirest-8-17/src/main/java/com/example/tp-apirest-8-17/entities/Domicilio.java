package com.example.tp_apirest_dsw.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Audited
@ToString
@Builder

public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
