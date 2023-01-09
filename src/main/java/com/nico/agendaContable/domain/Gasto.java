package com.nico.agendaContable.domain;

import lombok.Data;

@Data
public class Gasto {

    private long id;
    private String nombre;
    private TipoGasto tipoGasto;
    private String mesGasto;
    private boolean esGastoMensual;
}
