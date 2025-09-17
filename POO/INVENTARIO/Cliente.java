package POO.INVENTARIO;

import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedidos(Pedido p) {
        pedidos.add(p);
    }
}
