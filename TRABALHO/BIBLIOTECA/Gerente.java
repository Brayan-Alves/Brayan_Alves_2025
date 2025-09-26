package TRABALHO.BIBLIOTECA;

public class Gerente extends Pessoa{
    private double salario;

    public Gerente(String nome, String email, String senha, String telefone, String cpf) {
        super(nome, email, senha, telefone, cpf);
        this.salario = 15000.00;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
