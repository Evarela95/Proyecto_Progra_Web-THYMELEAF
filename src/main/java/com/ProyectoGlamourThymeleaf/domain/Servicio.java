package com.ProyectoGlamourThymeleaf.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;  //Hibernate lo transforma a id_cliente
    String nombreServicio;
    String precio;

    public Servicio() {
    }

    public Servicio(String nombreServicio, String precio) {
        this.nombreServicio = nombreServicio;
        this.precio = precio;
    }
    
    
}
