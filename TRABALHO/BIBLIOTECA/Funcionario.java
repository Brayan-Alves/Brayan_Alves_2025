package TRABALHO.BIBLIOTECA;

public class Funcionario extends Pessoa {

    private String turno;
    private double salario;

    public Funcionario(String nome, String email, String senha, String telefone, String cpf, Turnos turno, double salario) {
        super(nome, email, senha, telefone, cpf);
        this.turno = turno.name();
        this.salario = salario;
    }

    public enum Turnos{
        MANHA, TARDE, NOITE;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}