package POO.UNIVERSIDADE;

import java.util.List;

class Turma {
    private Curso curso;
    private List<Aluno> alunos;

    public Turma() {

    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
