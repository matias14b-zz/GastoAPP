package com.nico.agendaContable.GastoAPP.service;

import com.nico.agendaContable.GastoAPP.AbstractUtilTest;
import com.nico.agendaContable.GastoAPP.builder.GastoBuilder;
import com.nico.agendaContable.GastoAPP.domain.Gasto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

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

    @Test
    public void obtener_conGastos_retornaGastos() {
        GastoBuilder.gastoValido().build(entityManager);
        List<Gasto> gastos = gastoService.obtener();

        assertThat(gastos.get(0).getId()).isEqualTo(2);
    }

    @Test
    public void obtener_sinGastos_retornaListaVacia() {
        List<Gasto> gastos = gastoService.obtener();

        assertThat(gastos).isEmpty();

    }
}
