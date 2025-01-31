package com.example.aerolinea.controllers;


import com.example.aerolinea.entities.Usuario;
import com.example.aerolinea.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aerolinea/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }


    @GetMapping("/email")
    public Usuario findByEmail(@RequestParam String email) {
        return usuarioService.findByEmail(email);
    }
}