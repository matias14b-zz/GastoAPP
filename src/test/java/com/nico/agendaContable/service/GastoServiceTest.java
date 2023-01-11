package com.nico.agendaContable.service;

import com.nico.agendaContable.AbstractUtilTest;
import com.nico.agendaContable.Builder.GastoBuilder;
import com.nico.agendaContable.Service.GastoService;
import com.nico.agendaContable.domain.Gasto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class GastoServiceTest extends AbstractUtilTest {

    @Autowired
    private GastoService gastoService;

    @Test
    public void crearGasto_conGasto_creaGasto(){

        Gasto gastoNuevo= GastoBuilder.gastoValido().build();

        Gasto gastoCreado = gastoService.crearGasto(gastoNuevo);

        assertThat(gastoCreado.getId()).isNotNull();
    }

    @Test
    public void crearGasto_conNombreNull_lanzaExcepcion(){

        Gasto gastoNuevo= GastoBuilder.gastoValido().conNombre(null).build();

        assertThatIllegalArgumentException()
                .isThrownBy(()->gastoService.crearGasto(gastoNuevo))
                .withMessage("El nombre es obligatorio");
    }

    @Test
    public void crearGasto_conNombreVacio_lanzaExcepcion(){

        Gasto gastoNuevo= GastoBuilder.gastoValido().conNombre("").build();

        assertThatIllegalArgumentException()
                .isThrownBy(()->gastoService.crearGasto(gastoNuevo))
                .withMessage("El nombre es obligatorio");
    }

    @Test
    public void crearGasto_conNombreConEspacios_lanzaExcepcion(){

        Gasto gastoNuevo= GastoBuilder.gastoValido().conNombre("           ").build();

        assertThatIllegalArgumentException()
                .isThrownBy(()->gastoService.crearGasto(gastoNuevo))
                .withMessage("El nombre es obligatorio");
    }
}
