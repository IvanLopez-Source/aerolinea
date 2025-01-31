/*package com.example.aerolinea.services;

import com.example.aerolinea.entities.Vuelo;
import com.example.aerolinea.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;


    public Vuelo createVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }


    public List<Vuelo> buscarVuelos(String origen, String destino) {
        return vueloRepository.findByOrigenAndDestino(origen, destino);
    }


    public boolean verificarDisponibilidad(Long vueloId, int plazasSolicitadas) {
        Vuelo vuelo = vueloRepository.findById(vueloId).orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));
        return vuelo.getPlazasDisponibles() >= plazasSolicitadas;
    }


    public void actualizarEstadoVuelo(Long vueloId) {
        Vuelo vuelo = vueloRepository.findById(vueloId).orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));
        if (vuelo.getPlazasDisponibles() <= 0) {
            vuelo.setPlazasDisponibles(0);
            vuelo.setEstadoVuelo(false);
            vueloRepository.save(vuelo);
        }
    }
}*/