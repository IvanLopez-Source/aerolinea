/*package com.example.aerolinea.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Vuelo vuelo;
    private Long usuarioId;
    private Long vueloId;
    private String fechaReserva;
    private int plazasReservadas;
}*/