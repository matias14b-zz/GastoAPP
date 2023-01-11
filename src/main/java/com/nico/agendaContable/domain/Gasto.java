package com.nico.agendaContable.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Gasto {

    @Id
    private long id;
    private String nombre;
    private TipoGasto tipoGasto;
    private String mesGasto;
    private boolean esGastoMensual;
}
