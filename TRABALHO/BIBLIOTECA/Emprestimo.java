package TRABALHO.BIBLIOTECA;

import java.util.List;

public class Emprestimo{
    private String idEmprestimo;
    private List<Livro> livrosEmprestados;
    private Cliente cliente;
    
    public Emprestimo() {
    }

    public enum Situacao{
        ATRASADO, EMPRESTADO, DEVOLVIDO;
    }

    public String getIdEmprestimo() {
        return idEmprestimo;
    }
    public void setIdEmprestimo(String idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    public List<Livro> getLivro() {
        return livrosEmprestados;
    }
    public void addLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}