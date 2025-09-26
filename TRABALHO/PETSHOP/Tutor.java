package TRABALHO.PETSHOP;

import java.util.LinkedList;

public class Tutor extends Pessoa {
    
    private LinkedList<Animal> animais;
    private LinkedList<Servico> servicos;

    public Tutor(String nome, String telefone, String email, String cpf, String endereco) {
        super(nome, telefone, email, cpf, endereco);
        this.animais = new LinkedList<>();
        this.servicos = new LinkedList<>();
    }

    public LinkedList<Animal> getAnimais() {
        return animais;
    }
    public void setAnimais(LinkedList<Animal> animais) {
        this.animais = animais;
    }
    public LinkedList<Servico> getServicos() {
        return servicos;
    }
    public void setServicos(LinkedList<Servico> servicos) {
        this.servicos = servicos;
    }
}
