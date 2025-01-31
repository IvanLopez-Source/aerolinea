package com.example.aerolinea.services;

import com.example.aerolinea.entities.Aeropuerto;
import com.example.aerolinea.repositories.AeropuertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AeropuertoService {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;


    public Aeropuerto createAeropuerto(Aeropuerto aeropuerto) {
        return aeropuertoRepository.save(aeropuerto);
    }


    public List<Aeropuerto> listarAeropuertos() {
        return aeropuertoRepository.findAll();
    }
}