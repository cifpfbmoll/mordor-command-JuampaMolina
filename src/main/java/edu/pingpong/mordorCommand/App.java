package edu.pingpong.mordorCommand;

import edu.pingpong.mordorCommand.pedido.Pedido;
import edu.pingpong.mordorCommand.pedido.PedidoInternacional;
import edu.pingpong.mordorCommand.pedido.PedidoPeligroso;
import edu.pingpong.mordorCommand.pedido.PedidoPeligrosoOrden;
import edu.pingpong.mordorCommand.procesador.Oficina;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoInternacional;
import edu.pingpong.mordorCommand.tratamiento.TratamientoPedidoPeligroso;

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

        pedido = new PedidoPeligrosoOrden("Cima de los vientos",
                "No urgarse en las uñas con este puñal", 15);
        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        pedido = new PedidoPeligrosoOrden("Monte del destino",
                "No ponerselo en el dedo", 1);
        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        /**
         * Los pedidos multiples se completan en el ultimo de los casos test
         */
    }
}
