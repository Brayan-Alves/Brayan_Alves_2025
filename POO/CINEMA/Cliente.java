package POO.CINEMA;

import java.util.List;

public class Cliente {
    private String nome;
    private List<Sessao> ingressosComprados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sessao> getIngressosComprados() {
        return ingressosComprados;
    }

    public void comprarIngresso(Sessao s, Filme f, int numCadeira) {
        ingressosComprados.add(s);
        s.setFilme(f);
        s.addClientes(this);
        Cadeira c = new Cadeira();
        c.setNumero(numCadeira);
        c.setCliente(this);
    }
}
