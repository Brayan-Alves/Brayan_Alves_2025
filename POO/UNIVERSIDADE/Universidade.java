package POO.UNIVERSIDADE;


import java.util.List;

public class Universidade {
    private String nome;
    private String cidade;
    private List<Curso> cursos;

    public Universidade() {

    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }
    public List<Curso> getCursos() {
        return cursos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}