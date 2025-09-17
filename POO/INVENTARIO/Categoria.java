package POO.INVENTARIO;

import java.util.List;

public class Categoria {
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

    public void adProdutosProduto(Produto p) {
        produtos.add(p);
    }
}
