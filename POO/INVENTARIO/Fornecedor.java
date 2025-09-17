package POO.INVENTARIO;

import java.util.List;

public class Fornecedor {
    private String nome;
    private List<Produto> produtos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto p) {
        produtos.add(p);
    }
}
