package POO.CINEMA;

import java.util.List;
import java.time.LocalTime;

public class Sessao {
    private Sala sala;
    private Filme filme;
    private List<Cliente> clientes;
    private LocalTime horario;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente c) {
        clientes.add(c);
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
