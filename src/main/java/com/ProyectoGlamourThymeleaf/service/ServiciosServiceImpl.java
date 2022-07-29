
package com.ProyectoGlamourThymeleaf.service;

import com.ProyectoGlamourThymeleaf.dao.ServicioDao;
import com.ProyectoGlamourThymeleaf.domain.Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiciosServiceImpl implements ServiciosService{
    
    
    @Autowired
    private ServicioDao servicioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Servicio> getServicios() {
        return (List<Servicio>) servicioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Servicio getServicio(Servicio servicio) {
        return servicioDao.findById(servicio.getIdServicio()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Servicio servicio) {
        servicioDao.save(servicio);
    }

    @Override
    @Transactional
    public void delete(Servicio servicio) {
        servicioDao.delete(servicio);
    }
    
}
