package edu.pingpong.mordorCommand.tratamiento;

import edu.pingpong.mordorCommand.pedido.PedidoPeligroso;
import edu.pingpong.mordorCommand.pedido.PedidoPeligrosoOrden;

public class TratamientoPedidoPeligroso implements TratamientoPedido{

    private final PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    public PedidoPeligroso getPedido() {
        return pedido;
    }

    @Override
    public boolean tratar() {
        return !pedido.instrucciones().equals("No ponerselo en el dedo");
    }
}
