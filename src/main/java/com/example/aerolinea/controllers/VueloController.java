/*package com.example.aerolinea.controllers;


import com.example.aerolinea.entities.Vuelo;
import com.example.aerolinea.services.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aerolinea/vuelos")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @PostMapping("/crear")
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        return vueloService.createVuelo(vuelo);
    }

    @GetMapping("/buscar")
    public List<Vuelo> buscarVuelos(@RequestParam String origen, @RequestParam String destino) {
        return vueloService.buscarVuelos(origen, destino);
    }

    @PostMapping("/actualizarEstado/{vueloId}")
    public void actualizarEstado(@PathVariable Long vueloId) {
        vueloService.actualizarEstadoVuelo(vueloId);
    }
}*/