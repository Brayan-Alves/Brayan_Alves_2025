package TRABALHO.BIBLIOTECA;

import java.util.List;

public class Autor{
    private String nome;
    private List<Livro> livrosEscritos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public void addLivrosEscritos(Livro livros) {
        livrosEscritos.add(livros);
    }
}