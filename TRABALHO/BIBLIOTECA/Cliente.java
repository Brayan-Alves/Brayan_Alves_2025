package TRABALHO.BIBLIOTECA;

import java.util.List;

public class Cliente{
    private String nome;
    private List<Emprestimo> emprestimosFeitos;
    private List<Livro> livrosEmPosse;
    
    

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void verLivrosEmPosee(List<Livro> livrosEmPossse){
        System.out.println(livrosEmPossse);
    }

    
}