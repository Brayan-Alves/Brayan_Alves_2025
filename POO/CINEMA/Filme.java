package POO.CINEMA;

import java.util.List;

public class Filme {
    private String nome;
    private List<Sessao> sessoes;
    private List<Sala> salas;


    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public String getNome() {
        return nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
