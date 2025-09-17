package POO.UNIVERSIDADE;

import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}