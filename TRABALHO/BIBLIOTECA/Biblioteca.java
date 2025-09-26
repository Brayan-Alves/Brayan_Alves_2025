package TRABALHO.BIBLIOTECA;

import java.util.LinkedList;

public class Biblioteca {
    private String nome;
    private LinkedList<Livro> livros;
    private LinkedList<Gerente> gerentes;
    private LinkedList<Cliente> clientes;
    private LinkedList<Funcionario> funcionarios;
    private LinkedList<Emprestimo> emprestimos;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.funcionarios = new LinkedList<>();
        this.gerentes = new LinkedList<>();
        this.emprestimos = new LinkedList<>();
    }


    public void addEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    public void addGerente(Gerente gerente) {
        gerentes.add(gerente);
    }
    public void removeGerente(Gerente gerente) {
        gerentes.remove(gerente);
    }
    public void addLivro(Livro livro) {
        livros.add(livro);
    }
    public void removeLivro(Livro livro) {
        livros.remove(livro);
    }
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public LinkedList<Gerente> getGerentes() {
        return gerentes;
    }
    public void setGerentes(LinkedList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Livro> getLivros() {
        return livros;
    }
    public void setLivros(LinkedList<Livro> livros) {
        this.livros = livros;
    }
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public LinkedList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(LinkedList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    

}
