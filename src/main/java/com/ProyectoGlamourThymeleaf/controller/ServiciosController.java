package com.ProyectoGlamourThymeleaf.controller;

import com.ProyectoGlamourThymeleaf.domain.Servicio;
import com.ProyectoGlamourThymeleaf.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("/Servicios")
    public String inicio2(Model model) {

        var servicios = serviciosService.getServicios();
        model.addAttribute("servicios", servicios);

        return "/Servicios";
    }

    @GetMapping("/servicioNuevo")
    public String nuevoServicio(Servicio servicio) {
        
        return "/EditarServicios";
    }

    @PostMapping("/servicioGuardar")
    public String guardarServicio(Servicio servicio) {
        serviciosService.save(servicio);
        return "redirect:/Servicios";
    }

    @GetMapping("/servicioModificar/{idServicio}")
    public String modificarServicio(Servicio servicio, Model model) {
        servicio = serviciosService.getServicio(servicio);
        model.addAttribute("servicio", servicio);
        return "/EditarServicios";
    }

    @GetMapping("/servicioEliminar/{idServicio}")
    public String EliminarServicio(Servicio servicio) {
        serviciosService.delete(servicio);
        return "redirect:/Servicios";
    }

}
