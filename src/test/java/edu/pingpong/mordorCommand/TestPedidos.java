package edu.pingpong.mordorCommand;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.pedido.PedidoInternacional;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoInternacional;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPedidos {
    /**
     * Crea una clase TratamientoPedidoInternacional que permita tratar
     * pedidos internacionales.
     *
     * La clase permite tratar todos los pedidos excepto
     * los que van a Mordor.
     *
     * Crea las clases necesarias que se requieren en los casos test
     * respetando los constructores que se exigen.
     */
    @Test
    public void test_Mordor() {

        Pedido pedidoInt = new PedidoInternacional("Mordor", 100);
        assertEquals("Mordor", pedidoInt.destino());

        TratamientoPedido tratamientoKO = new TratamientoPedidoInternacional(
                (PedidoInternacional) pedidoInt);
        assertNotNull(tratamientoKO);
        assertFalse(tratamientoKO.tratar());
    }

    @Test
    public void test_Comarca() {

        Pedido pedidoInt = new PedidoInternacional("Comarca", 100);
        assertEquals("Comarca", pedidoInt.destino());

        TratamientoPedido tratamientoOK = new TratamientoPedidoInternacional(
                (PedidoInternacional) pedidoInt);
        assertNotNull(tratamientoOK);
        assertTrue(tratamientoOK.tratar());
    }
}
