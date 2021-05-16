package edu.pingpong.mordorCommand;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.pedido.PedidoInternacional;
import edu.pingpong.mordorCommand.procesador.Oficina;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoInternacional;

public class App {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();

        Pedido pedido = new PedidoInternacional("Comarca", 10);
        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
                (PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoInternacional("Mordor", 10);
        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

    }
}
