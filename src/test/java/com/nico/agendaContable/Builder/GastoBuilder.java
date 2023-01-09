package com.nico.agendaContable.Builder;

import com.nico.agendaContable.domain.Gasto;
import com.nico.agendaContable.domain.TipoGasto;
import com.somospnt.test.builder.AbstractPersistenceBuilder;

import java.time.LocalDateTime;

public class GastoBuilder extends AbstractPersistenceBuilder<Gasto> {

    private GastoBuilder() {
        instance = new Gasto();
    }
    public static GastoBuilder gastoValido(){
        GastoBuilder builder = new GastoBuilder();
        builder.instance.setNombre("fibertel");
        builder.instance.setTipoGasto(TipoGasto.SERVICIOS);
        builder.instance.setEsGastoMensual(true);
        builder.instance.setMesGasto(LocalDateTime.now().getMonth().toString());

        return builder;
    }

    public GastoBuilder conNombre(String nombre) {
        instance.setNombre(nombre);
        return this;
    }

    public GastoBuilder conTipoGasto(TipoGasto tipoGasto){
        instance.setTipoGasto(tipoGasto);
        return this;
    }

    public GastoBuilder esGastoMensual(boolean esGasto) {
        instance.setEsGastoMensual(esGasto);
        return this;
    }

    public GastoBuilder conMesGasto(String mes){
        instance.setMesGasto(mes);
        return this;
    }
}
