/*package com.example.aerolinea.repositories;

import com.example.aerolinea.entities.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {
    List<Vuelo> findByOrigenAndDestino(String origen, String destino);
    boolean verificarDisponibilidad(Long vueloId, int plazasSolicitadas);
}
*/