package POO.HOSPITAL;

import java.util.List;

public class Medico {
    private String nome;
    private List<Paciente> pacientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPacientes(Paciente p) {
        pacientes.add(p);
    }

    public void receitarMedicamento(Paciente p, Medicamento m){
        p.addMedicamentos(m);
    }
}
