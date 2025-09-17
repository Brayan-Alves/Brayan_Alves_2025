package POO.HOSPITAL;

public class Enfermeira {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void administrarMedicamento(Paciente p, Medicamento m){
        p.rmvMedicamentos(m);
    }
}
