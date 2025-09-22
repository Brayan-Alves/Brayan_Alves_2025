package TRABALHO.BIBLIOTECA;

public class Funcionario extends Pessoa {
    private String matricula;

    public Funcionario(String nome, String email, String senha, String telefone, String cpf, String matricula) {
        super(nome, email, senha, telefone, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}