package br.edu.ifpr.agenda.view;

import br.edu.ifpr.agenda.controller.ContatoController;
import br.edu.ifpr.agenda.model.Contato;
public class Main {
    public static void main(String[] args) {
        System.out.println("Testando");
        Contato contato = new Contato();
        ContatoController controller = new ContatoController();
        contato.setNome("Fulano de Tal");
        contato.setCelular("(45)9999-9999");
        contato.setEmail("fulano@gmail.com");
        controller.cadastrarContato(contato);

    }
}