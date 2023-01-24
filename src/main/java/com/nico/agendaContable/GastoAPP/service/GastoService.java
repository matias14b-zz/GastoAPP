package com.nico.agendaContable.GastoAPP.service;


import com.nico.agendaContable.GastoAPP.domain.Gasto;
import com.nico.agendaContable.GastoAPP.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    public Gasto crearGasto(Gasto gasto) {
        Assert.notNull(gasto.getNombre(), "El nombre es obligatorio");
        Assert.isTrue(!gasto.getNombre().isEmpty(), "El nombre es obligatorio");
        Assert.hasText(gasto.getNombre(), "El nombre es obligatorio");
        return gastoRepository.save(gasto);
    }

    public List<Gasto> obtener() {
        final List<Gasto> all = gastoRepository.findAll();
        return all;
    }
}
