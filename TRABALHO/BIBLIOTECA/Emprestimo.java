package TRABALHO.BIBLIOTECA;

import java.util.List;
import java.time.LocalDate;

public class Emprestimo{
    private String idEmprestimo;
    private List<Livro> livrosEmprestados;
    private Cliente cliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Status estadoEmprestimo;

    public Emprestimo(String idEmprestimo, Cliente cliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.idEmprestimo = idEmprestimo;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.estadoEmprestimo = estadoEmprestimo.EMPRESTADO;
    }
    public Emprestimo() {
    }
    public Status getEstadoEmprestimo() {
        return estadoEmprestimo;
    }
    public void setEstadoEmprestimo(Status estadoEmprestimo) {
        this.estadoEmprestimo = estadoEmprestimo;
    }

    public enum Status{
        ATRASADO, EMPRESTADO, DEVOLVIDO
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
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
    public void verificarStatus(LocalDate dataDevolucao){
        if(dataDevolucao.isBefore(LocalDate.now()));    
    }
}