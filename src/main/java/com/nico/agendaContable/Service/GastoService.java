package com.nico.agendaContable.Service;


import com.nico.agendaContable.domain.Gasto;
import com.nico.agendaContable.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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
}
