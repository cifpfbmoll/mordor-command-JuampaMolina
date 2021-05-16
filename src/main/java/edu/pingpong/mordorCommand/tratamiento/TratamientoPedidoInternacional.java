package edu.pingpong.mordorCommand.tratamiento;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.pedido.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {
    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    public PedidoInternacional getPedido() {
        return this.pedido;
    }

    @Override
    public boolean tratar() {
        return !pedido.destino().equals("Mordor");
    }
}
