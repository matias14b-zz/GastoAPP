package com.nico.agendaContable.Service;


import com.nico.agendaContable.domain.Gasto;
import com.nico.agendaContable.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    public Gasto crearGasto(Gasto gastoNuevo) {
        return gastoRepository.save(gastoNuevo);
    }
}
