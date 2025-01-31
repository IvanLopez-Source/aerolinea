/*package com.example.aerolinea.services;


import com.example.aerolinea.entities.Reserva;
import com.example.aerolinea.repositories.ReservaRepository;
import com.example.aerolinea.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VueloRepository vueloRepository;

    // Realizar una reserva
    public String hacerReserva(Long usuarioId, Long vueloId, int plazasSolicitadas) {
        if (!vueloRepository.existsById(vueloId)) {
            throw new RuntimeException("Vuelo no disponible");
        }

        if (!vueloRepository.verificarDisponibilidad(vueloId, plazasSolicitadas)) {
            throw new RuntimeException("No hay plazas suficientes");
        }

        Reserva reserva = new Reserva();
        reserva.setUsuarioId(usuarioId);
        reserva.setVueloId(vueloId);
        reserva.setPlazasReservadas(plazasSolicitadas);
        reserva.setFechaReserva(LocalDateTime.now().toString());

        reservaRepository.save(reserva);
        return "Reserva realizada con éxito";
    }
}*/