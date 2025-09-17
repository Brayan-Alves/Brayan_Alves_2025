package POO.UNIVERSIDADE;

import java.util.List;

class Professor {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public Professor() {
    }

    public void minstrarDisciplina(Disciplina disciplina, Turma turma) {
        disciplinas.add(disciplina);
        turmas.add(turma);
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

    public List<Turma> getTurma(Turma turmas){
        return turmas;
    }

}
