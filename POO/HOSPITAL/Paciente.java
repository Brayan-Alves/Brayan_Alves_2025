package POO.HOSPITAL;

import java.util.List;

public class Paciente {
    private String nome;
    private Quarto quarto;
    private Medico medicoResponsavel;
    private List<Medicamento> medicamentos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void addMedicamentos(Medicamento m) {
        medicamentos.add(m);
    }

    public void rmvMedicamentos(Medicamento m) {
        medicamentos.remove(m);
    }
}
