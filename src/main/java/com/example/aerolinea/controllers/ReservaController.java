/*package com.example.aerolinea.controllers;


import com.example.aerolinea.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aerolinea/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/realizar")
    public String hacerReserva(@RequestParam Long usuarioId, @RequestParam Long vueloId, @RequestParam int plazasSolicitadas) {
        return reservaService.hacerReserva(usuarioId, vueloId, plazasSolicitadas);
    }
}*/