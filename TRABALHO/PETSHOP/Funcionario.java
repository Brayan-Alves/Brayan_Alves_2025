package TRABALHO.PETSHOP;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String telefone, String email, String cpf, String endereco, String cargo) {
        super(nome, telefone, email, cpf, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
