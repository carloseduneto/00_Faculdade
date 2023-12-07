package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private String nome;
    private List<Pedido> pedidos;

    public Clientes(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

}
