package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("IFPR Biblioteca");

        Character operacao = ' ';
        String nome;
        String email;
        String senha;
        String telefone;
        String cpf;

        biblioteca.addLivro(new Livro("1984", new Autor("George Orwell"), new Editora("Companhia das Letras"), 3));
        biblioteca.addLivro(new Livro("O Senhor dos Anéis", new Autor("J.R.R. Tolkien"), new Editora("HarperCollins"), 2));
        biblioteca.addLivro(new Livro("Dom Casmurro", new Autor("Machado de Assis"), new Editora("Penguin-Companhia"), 4));

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

            biblioteca.addCliente(new Cliente(nome, email, senha, telefone, cpf));
            System.out.printf("\nLogin Criado!\n\nO que deseja: ");

            menuCliente(biblioteca, operacao);
        }


        

        



        

    }

    public static Character lerComRestricaoARec(Character operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoARec(operacao);

    }

    public static Character lerComRestricaoBRec(Character operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2' || operacao == '3' || operacao == '4'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoBRec(operacao);
    }

    public static Character lerComRestricaoCRec(Character operacao, Biblioteca biblioteca){
        operacao = LER.next().charAt(0);
        if(Character.isDigit(operacao)){
            if(Character.getNumericValue(operacao) > 0 && Character.getNumericValue(operacao) <= biblioteca.getLivros().size()){
                return operacao;
            }
            
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoCRec(operacao, biblioteca);
    }

    public static Character lerComRestricaoDRec(Character operacao){
        operacao = LER.next().charAt(0);
        operacao = Character.toUpperCase(operacao);
        if(operacao == 'S' || operacao == 'N'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoDRec(operacao);
    }

    public static void menuCliente(Biblioteca biblioteca, Character operacao){
        System.out.printf("\n1. Fazer um empréstimo\n2. Ver empréstimos feitos\n3. Livros em posse\n4. Meus dados\n");
        operacao = lerComRestricaoBRec(operacao);
        
        if(operacao == '1'){
            boolean primeiraVez = true;
            fazerEmprestimo(biblioteca,  operacao, primeiraVez);
        }else if(operacao == '2'){
            System.out.printf("\nEmpréstimos feitos:\n");
            for(Emprestimo emprestimo : biblioteca.getClientes().getLast().getEmprestimosFeitos()){
                int cont = 0;
                System.out.printf("Data do empréstimo: %s | Data de devolução: %s | Status: %s\n", emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao(), emprestimo.getEstadoEmprestimo());
                System.out.println("  Livros emprestados:");
                for (Livro livro : emprestimo.getLivrosEmprestados()) {
                    cont++;
                    System.out.printf("    %d. %s (Autor: %s, Editora: %s)\n", cont, livro.getNome(), livro.getAutor().getNome(), livro.getEditora().getNome());
                }
                    
            }
            menuCliente(biblioteca, operacao);
        }else if(operacao == '3'){
            biblioteca.getClientes().getLast().getLivrosEmPosse();
            if(biblioteca.getClientes().getLast().getLivrosEmPosse().isEmpty()){
                System.out.printf("\nNenhum livro em posse.\n");
            }
            menuCliente(biblioteca, operacao);
        }else{
            System.out.printf("\nNome: %s\nCPF: %s\nTelefone: %s\nEmail: %s\nSenha: %s\n", biblioteca.getClientes().getLast().getNome(), biblioteca.getClientes().getLast().getCpf(), biblioteca.getClientes().getLast().getTelefone(), biblioteca.getClientes().getLast().getEmail(), biblioteca.getClientes().getLast().getSenha());
            menuCliente(biblioteca, operacao);
        }
    }

    public static void verLivrosDisponiveis(Biblioteca biblioteca, Character operacao){
        System.out.printf("\nLivros disponíveis:\n");
        int cont = 0;
        for(Livro livro : biblioteca.getLivros()){
            cont++;
            if(livro.getCopiasNoAcervo() > 0){
                System.out.printf(cont+". Nome: %s | Autor: %s | Editora: %s | Cópias disponíveis: %d\n", livro.getNome(), livro.getAutor().getNome(), livro.getEditora().getNome(), livro.getCopiasNoAcervo());
            }
        }  
    }

    public static void fazerEmprestimo(Biblioteca biblioteca, Character operacao, boolean primeiraVez){
        verLivrosDisponiveis(biblioteca, operacao);
        System.out.printf("\nDigite o número do livro que deseja pegar emprestado: ");
        operacao = lerComRestricaoCRec(operacao, biblioteca);
        if(primeiraVez){
            biblioteca.addEmprestimo(new Emprestimo(biblioteca.getClientes().getLast(), LocalDate.now(), LocalDate.now().plusDays(7)));
            primeiraVez = false;
        }
        biblioteca.getEmprestimos().getLast().addLivro(biblioteca.getLivros().get(Character.getNumericValue(operacao) - 1));
        biblioteca.getClientes().getLast().addEmprestimo(biblioteca.getEmprestimos().getLast());
        biblioteca.getClientes().getLast().addLivroEmPosse(biblioteca.getLivros().get(Character.getNumericValue(operacao) - 1));
        System.out.printf("\nEmpréstimo realizado com sucesso!\n");
        System.out.println("Deseja fazer outro empréstimo? (S/N)");
        operacao = lerComRestricaoDRec(operacao);
        if(operacao == 'S'){
            fazerEmprestimo(biblioteca, operacao, primeiraVez);
        }else{
            System.out.println("Data de devolução: " + biblioteca.getEmprestimos().getLast().getDataDevolucao()+"\n");
            System.out.println("Voltando ao menu principal...");
            menuCliente(biblioteca, operacao);
        }

    }

}
