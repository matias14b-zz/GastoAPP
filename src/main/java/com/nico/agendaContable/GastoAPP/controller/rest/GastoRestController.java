package com.nico.agendaContable.GastoAPP.controller.rest;

import com.nico.agendaContable.GastoAPP.domain.Gasto;
import com.nico.agendaContable.GastoAPP.service.GastoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GastoRestController {

    private final GastoService gastoService;

    @GetMapping("/api/gastos")
    public List<Gasto> obtener(){
        return gastoService.obtener();
    }
}
