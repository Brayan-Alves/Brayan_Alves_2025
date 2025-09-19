package TRABALHO.BIBLIOTECA;

import java.util.List;

public class Editora{
    private String nome;
    private List<Livro> livros;

    public Editora() {
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}