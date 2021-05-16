package edu.pingpong.mordorCommand.pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido{

    private String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }
}
