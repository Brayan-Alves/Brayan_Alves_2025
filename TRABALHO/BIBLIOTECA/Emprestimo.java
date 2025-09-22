package TRABALHO.BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Emprestimo {
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
        this.livrosEmprestados = new ArrayList<>();
        this.estadoEmprestimo = Status.EMPRESTADO;
    }

    public enum Status {
        ATRASADO, EMPRESTADO, DEVOLVIDO
    }

    public void verificarStatus() {
        if (estadoEmprestimo == Status.DEVOLVIDO) return;
        
        if (LocalDate.now().isAfter(dataDevolucao)) {
            estadoEmprestimo = Status.ATRASADO;
        } else {
            estadoEmprestimo = Status.EMPRESTADO;
        }
    }

    public Status getEstadoEmprestimo() {
        verificarStatus();
        return estadoEmprestimo;
    }

    public void setEstadoEmprestimo(Status estadoEmprestimo) {
        this.estadoEmprestimo = estadoEmprestimo;
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

    public String getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(String idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void addLivro(Livro livro) {
        if (livro.getCopiasNoAcervo() > 0) {
            livrosEmprestados.add(livro);
            livro.setCopiasNoAcervo(livro.getCopiasNoAcervo() - 1);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setCopiasNoAcervo(livro.getCopiasNoAcervo() + 1);
        }
    }
}