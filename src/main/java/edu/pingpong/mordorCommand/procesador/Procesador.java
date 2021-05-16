package edu.pingpong.mordorCommand.procesador;

import edu.pingpong.mordorCommand.tratamiento.TratamientoPedido;

public interface Procesador {

    boolean procesa(TratamientoPedido pedido);
}
