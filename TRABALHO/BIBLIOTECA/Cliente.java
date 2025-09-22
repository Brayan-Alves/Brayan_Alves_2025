package TRABALHO.BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private List<Emprestimo> emprestimosFeitos;
    private List<Livro> livrosEmPosse;
    
    

    public Cliente(String nome, String email, String senha, String telefone, String cpf) {
        super(nome, email, senha, telefone, cpf);
        this.emprestimosFeitos = new ArrayList<>();
        this.livrosEmPosse = new ArrayList<>();
    }

    public List<Emprestimo> getEmprestimosFeitos() {
        return emprestimosFeitos;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        emprestimosFeitos.add(emprestimo);
    }

    public List<Livro> getLivrosEmPosse() {
        return livrosEmPosse;
    }

    public void addLivroEmPosse(Livro livro) {
        livrosEmPosse.add(livro);
    }

    public void removerLivroEmPosse(Livro livro) {
        livrosEmPosse.remove(livro);
    }

    public void verLivrosEmPosse() {
        if (livrosEmPosse.isEmpty()) {
            System.out.println("Nenhum livro em posse.");
        } else {
            for (Livro livro : livrosEmPosse) {
                System.out.println("- " + livro.getNome());
            }
        }
    }
    
}