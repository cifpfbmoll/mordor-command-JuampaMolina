package edu.pingpong.mordorCommand.procesador;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;

public class Oficina implements Procesador{

    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }

    public String printarStatus(boolean status, Pedido pedido) {
        return status?
                "El pedido " + pedido.id() + " con destino " + pedido.destino() + " ha sido " + Status.ACEPTADO.name():
                "El pedido " + pedido.id() + " con destino " + pedido.destino() + " ha sido " + Status.RECHAZADO.name();
    }
}
