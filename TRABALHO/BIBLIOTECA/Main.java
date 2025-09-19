package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;

import LISTA.Pessoa;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
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
        System.out.printf("2. Navegar como Funcionário");
        char operacao;

        do {
            operacao = LER.next().charAt(0);
        } while (operacao != '1' || operacao != '2');

        LER.nextLine();
        System.out.printf("Digite seu Nome: ");
        String nome = LER.nextLine();
        System.out.printf("Digite seu E-mail: ");
        String email = LER.next();
        System.out.printf("Digite sua senha: ");
        String senha = LER.next();

        Cliente c1 = new Cliente(nome, email, senha);


        

    }
}
