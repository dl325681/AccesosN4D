package com.SolucionAccesoN4d.Acceson4D.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.SolucionAccesoN4d.Acceson4D.servicios.ServiciosUsuario;
import com.SolucionAccesoN4d.Acceson4D.modelo.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")
public class ControladorEjercicio {


@GetMapping("/todos")
public List<Usuario> todos() {
    return ServiciosUsuario.getInstancia().getUsuarios();
}

@PostMapping("/carga")
public void cargarDatosIniciales() {
     ServiciosUsuario.getInstancia().cargarDatosIniciales();
}    

}



