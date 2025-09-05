package UNIVERSIDADE;

public class Disciplina {
    private String nome;
    private Professor responsavel;
    public Disciplina() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Professor responsavel) {
        this.responsavel = responsavel;
    }
}
