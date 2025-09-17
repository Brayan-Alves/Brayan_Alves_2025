package POO.INVENTARIO;

import java.util.List;

public class Pedido {
    private String nome;
    private Cliente cliente;
    private List<Produto> produtos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto p) {
        produtos.add(p);
    }
}
