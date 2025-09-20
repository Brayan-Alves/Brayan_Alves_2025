package TRABALHO.BIBLIOTECA;

import java.util.List;

public class Cliente extends Pessoa{
    private List<Emprestimo> emprestimosFeitos;
    private List<Livro> livrosEmPosse;
    
    

    public Cliente(String nome, String email, String senha, String telefone, String cpf) {
        super(nome, email, senha, telefone, cpf);
        this.nome = nome;
        this.email =  email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;

    }

    

    public List<Emprestimo> getEmprestimosFeitos() {
        return emprestimosFeitos;
    }

    public void addEmprestimosFeitos(Emprestimo emprestimo) {
        emprestimosFeitos.add(emprestimo);
    }

    public List<Livro> getLivrosEmPosse() {
        return livrosEmPosse;
    }

    public void addLivrosEmPosse(Livro livro) {
        livrosEmPosse.add(livro);
    }

    public void verLivrosEmPosee(List<Livro> livrosEmPossse){
        System.out.println(livrosEmPossse);
    }

    
}