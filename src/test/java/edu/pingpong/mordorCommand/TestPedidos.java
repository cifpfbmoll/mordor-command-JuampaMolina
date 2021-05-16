package edu.pingpong.mordorCommand;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.pedido.PedidoInternacional;
import edu.pingpong.mordorCommand.pedido.PedidoPeligroso;
import edu.pingpong.mordorCommand.pedido.PedidoPeligrosoOrden;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoInternacional;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoPeligroso;
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

    /**
     * Crea una clase TratamientoPedidoPeligroso que permita tratar
     * pedidos peligrosos.
     *
     * La clase permite tratar todos los pedidos segun sus
     * instrucciones excepto aquellos cuya instruccion sea
     * "No ponerselo en el dedo".
     *
     * Crea las clases necesarias que se requieren en los casos test
     * respetando los constructores que se exigen.
     */
    @Test
    public void test_pedido_peligroso_KO() {

        Pedido pedidoConPeligro = new PedidoPeligrosoOrden("Monte del destino",
                "No ponerselo en el dedo", 1);
        assertEquals("Monte del destino", pedidoConPeligro.destino());

        TratamientoPedido tratamientoKO = new TratamientoPedidoPeligroso(
                (PedidoPeligroso) pedidoConPeligro);
        assertNotNull(tratamientoKO);
        assertFalse(tratamientoKO.tratar());
    }

    @Test
    public void test_pedido_peligroso_OK() {

        Pedido pedidoConPeligro = new PedidoPeligrosoOrden("Cima de los vientos",
                "No urgarse en las uñas con este puñal", 15);
        assertEquals("Cima de los vientos", pedidoConPeligro.destino());

        TratamientoPedido tratamientoOK = new TratamientoPedidoPeligroso(
                (PedidoPeligroso) pedidoConPeligro);
        assertTrue(tratamientoOK.tratar());
    }

    /**
     * Añade a las clases PedidoInternacional y PedidoPeligrosoOrden
     * una identificador Id de tipo String
     * autogenerado haciendo uso de la clase UUID de Java
     * https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html
     */
    @Test
    public void test_UUID_generator() {

        PedidoInternacional internacional = new PedidoInternacional("Mordor", 10);
        PedidoPeligrosoOrden peligroso = new PedidoPeligrosoOrden("Cima de los vientos",
                "No urgarse en las uñas con este puñal", 15);
        assertNotNull(internacional.getId());
        assertNotNull(peligroso.getId());

        assertNotEquals(internacional.getId(), peligroso.getId());
    }
}
