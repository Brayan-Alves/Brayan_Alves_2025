package TRABALHO.BIBLIOTECA;


public class Livro{
    private String nome;
    private Autor autor;
    private Editora editora;
    private int copiasTotal;
    private int copiasNoAcervo;

    public Livro() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getCopiasTotal() {
        return copiasTotal;
    }

    public void setCopiasTotal(int copiasTotal) {
        this.copiasTotal = copiasTotal;
    }

    public int getCopiasNoAcervo() {
        return copiasNoAcervo;
    }

    public void setCopiasNoAcervo(int copiasNoAcervo) {
        this.copiasNoAcervo = copiasNoAcervo;
    }
}