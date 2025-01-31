package com.example.aerolinea.controllers;


import com.example.aerolinea.entities.Aeropuerto;
import com.example.aerolinea.services.AeropuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aerolinea/aeropuertos")
public class AeropuertoController {

    @Autowired
    private AeropuertoService aeropuertoService;

    @PostMapping("/crear")
    public Aeropuerto crearAeropuerto(@RequestBody Aeropuerto aeropuerto) {
        return aeropuertoService.createAeropuerto(aeropuerto);
    }

    @GetMapping("/listar")
    public List<Aeropuerto> listarAeropuertos() {
        return aeropuertoService.listarAeropuertos();
    }
}
