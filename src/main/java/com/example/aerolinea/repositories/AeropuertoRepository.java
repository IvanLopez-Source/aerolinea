package com.example.aerolinea.repositories;

import com.example.aerolinea.entities.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeropuertoRepository extends JpaRepository<Aeropuerto, Long> {
}