package com.nico.agendaContable.GastoAPP.domain;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private TipoGasto tipoGasto;
    private String mesGasto;
    private boolean esGastoMensual;
}
