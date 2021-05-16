package edu.pingpong.mordorCommand.tratamiento;

import edu.pingpong.mordorCommand.pedido.Pedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido{

    private Set<Pedido> pedidos;
    private Integer pesoTotal;
    private Long numBultos;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    public Long getNumBultos() {
        return this.numBultos;
    }

    public void calcularPesoTotal() {
        Integer sumPeso = 0;
        for (Pedido pedido : pedidos) {
            sumPeso += pedido.peso();
        }
        this.pesoTotal = sumPeso;
    }

    public void calcularTotalBultos() {
        Long sumBultos = 0l;
        for (Pedido pedido : pedidos) {
            sumBultos++;
        }
        this.numBultos = sumBultos;
    }

    @Override
    public boolean tratar() {
        return (getPesoTotal() > 0) && (pedidos.size() == getNumBultos().intValue());
    }
}
