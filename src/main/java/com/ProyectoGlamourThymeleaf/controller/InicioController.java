package com.ProyectoGlamourThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String mostrarInicio() {

        return "Inicio";
    }

    @GetMapping("/Contacto")
    public String mostrarContacto() {

        return "Contacto";
    }

    @GetMapping("/Galeria")
    public String mostrarGaleria() {

        return "Galeria";
    }

    @GetMapping("/Nosotros")
    public String mostrarNosotros() {

        return "Nosotros";
    }

    @GetMapping("/Novedades")
    public String mostrarNovedades() {

        return "Novedades";
    }

    @GetMapping("/Promociones")
    public String mostrarPromociones() {

        return "Promociones";
    }

    @GetMapping("/Registrarse")
    public String mostrarRegistrarse() {

        return "Registrarse";
    }

    @GetMapping("/Servicios")
    public String mostrarServicios() {

        return "Servicios";
    }
}
