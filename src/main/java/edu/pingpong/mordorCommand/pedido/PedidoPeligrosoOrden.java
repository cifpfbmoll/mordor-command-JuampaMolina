package edu.pingpong.mordorCommand.pedido;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso{

    private final String id;
    private final String destino;
    private final String instrucciones;
    private final int peso;

    public PedidoPeligrosoOrden(String destino, String instrucciones, int peso) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.instrucciones = instrucciones;
        this.peso = peso;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }
}
