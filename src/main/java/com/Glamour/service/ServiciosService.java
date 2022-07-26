package com.Glamour.service;

import com.Glamour.domain.Servicio;
import java.util.List;

public interface ServiciosService {

    public List<Servicio> getServicios();

    public Servicio getServicio(Servicio servicio);

    public void save(Servicio servicio);

    public void delete(Servicio servicio);

}
