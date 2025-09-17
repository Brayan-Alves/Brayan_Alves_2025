package POO.UNIVERSIDADE;

import java.util.List;

class Aluno {
    private String nome;
    private Turma turma;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno() {
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinasMatriculadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


}
