package org.unrn.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRestaurant {
    Mesa mesa;

    @BeforeEach
    public void seCreaMesaConPedidos() {
        mesa = new Mesa();
        mesa.crearPedido("Plato1", "Bebida1");
        mesa.crearPedido("Plato2", "Bebida2");
        mesa.crearPedido("Plato3", "Bebida3");
        mesa.crearPedido("Plato1", "Bebida3");
    }

    @Test
    public void sePagaConVisa() {
        Visa visa = new Visa();
//        assertEquals(70, mesa.calcularTotalPlatos());
//        assertEquals(9, mesa.calcularTotalBebidas());
//        assertEquals(78.73, mesa.calcularDescuento(Mesa.Tarjeta.VISA, 70, 9));
//        assertEquals(80.3046, mesa.calcularPropina(Mesa.Propina.DOS, 78.73), 0.001);
        assertEquals(80.3046,
                mesa.cobrar(visa, Mesa.Propina.DOS),
                0.001);
    }

    @Test
    public void sePagaConMastercard() {
        Mastercard mastercard = new Mastercard();
        assertEquals(79.928,
                mesa.cobrar(mastercard, Mesa.Propina.TRES),
                0.001);
    }

    @Test
    public void sePagaConComarcaPlus() {
        ComarcaPlus comarcaplus = new ComarcaPlus();
        assertEquals(81.291,
                mesa.cobrar(comarcaplus, Mesa.Propina.CINCO),
                0.001);
    }

    @Test
    public void seSePagaConOtra() {
        Otra viedma = new Otra();
        assertEquals(82.95,
                mesa.cobrar(viedma, Mesa.Propina.CINCO),
                0.001);
    }
}
