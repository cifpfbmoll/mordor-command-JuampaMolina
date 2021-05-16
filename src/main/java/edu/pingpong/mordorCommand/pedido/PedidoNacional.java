package edu.pingpong.mordorCommand.pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido{

    private final String id;
    private String destino;
    private int peso;

    public PedidoNacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
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
}
