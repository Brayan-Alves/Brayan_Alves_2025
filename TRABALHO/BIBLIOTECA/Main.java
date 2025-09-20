package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;

import LISTA.Pessoa;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        char operacao = ' ';
        String nome;
        String email;
        String senha;
        String telefone;
        String cpf;

        System.out.println(" ____  _ _     _ _       _                 \n" + //
                        "| __ )(_) |__ | (_) ___ | |_ ___  ___ __ _ \n" + //
                        "|  _ \\| | '_ \\| | |/ _ \\| __/ _ \\/ __/ _` |\n" + //
                        "| |_) | | |_) | | | (_) | ||  __/ (_| (_| |\n" + //
                        "|____/|_|_.__/|_|_|\\___/ \\__\\___|\\___\\__,_|\n" + //
                        "/ ___| _   _ ___| |_ ___ _ __ ___          \n" + //
                        "\\___ \\| | | / __| __/ _ \\ '_ ` _ \\         \n" + //
                        " ___) | |_| \\__ \\ ||  __/ | | | | |        \n" + //
                        "|____/ \\__, |___/\\__\\___|_| |_| |_|        \n" + //
                        "       |___/                               \n\n");
        
        System.out.printf("Bem vindo!\nO que deseja?\n\n");
        System.out.printf("1. Navegar como Cliente\n");
        System.out.printf("2. Navegar como Funcionário\n");


        operacao = lerComRestricaoARec(operacao);

        LER.nextLine();
        if(operacao == '1'){
            System.out.printf("Digite seu nome: ");
            nome = LER.nextLine();
            System.out.printf("Digite seu email: ");
            email = LER.nextLine();
            System.out.printf("Digite sua senha: ");
            senha = LER.nextLine();
            System.out.printf("Digite seu telefone: ");
            telefone = LER.nextLine();
            System.out.printf("Digite seu CPF: ");
            cpf = LER.nextLine();

            Cliente c1 = new Cliente(nome, email, senha, telefone, cpf);
            System.out.printf("\nLogin Criado!\n\nO que deseja: ");

            System.out.printf("\n1. Fazer um empréstimo\n2. Ver empréstimos feitos\n3. Livros em posse\n4. Meus dados\n");
            operacao = lerComRestricaoBRec(operacao);

            if(operacao == '1'){

            }else if(operacao == '2'){
                c1.getEmprestimosFeitos();
            }else if(operacao == '3'){
                c1.getLivrosEmPosse();
            }else{
                System.out.printf("\nNome: %s\nCPF: %s\nTelefone: %s\nEmail: %s\nSenha: %s\n", c1.getNome(), c1.getCpf(), c1.getTelefone(), c1.getEmail(), c1.getSenha());
            }
        }


        

        



        

    }

    public static char lerComRestricaoARec(char operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoARec(operacao);

    }

    public static char lerComRestricaoBRec(char operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2' || operacao == '3' || operacao == '4'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoARec(operacao);

    }
}
