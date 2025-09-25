package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("IFPR Biblioteca");

        Character operacao = ' ';
        String operacaoA = null;
        String nome = null;
        String telefone = null;
        String cpf = null;
        String senha = null;
        String email = null;

        preSetLivros(biblioteca);
        
        while (true) {
            imprimirCabecalho();
            operacao = lerComRestricaoARec(operacao);
    
            limparTela();
    
            if(operacao == '1'){
                login(nome, senha, email, telefone, cpf, biblioteca, '1');
                menuCliente(biblioteca, operacao);
            }else if(operacao == '2'){
                login(nome, senha, email, telefone, cpf, biblioteca, '2');
                menuFuncionario(biblioteca, operacao);
            }else if(operacao == '3'){
                login(nome, senha, email, telefone, cpf, biblioteca, '3');
                menuGerente(biblioteca, operacaoA, operacao);
            }else{
                System.out.println("Obrigado por usar o sistema!");
                System.exit(0);
            }
        }  

    }

    public static void menuFuncionario(Biblioteca biblioteca, Character operacao){
        System.out.println("1. Adicionar livro\n 2. Remover livro\n 3. Ver todos os livros\n4. Ver empréstimos\n 5. Logout");
        operacao = lerComRestricaoBRec(operacao);
        if(operacao == '1'){
            LER.nextLine();
            System.out.println("Digite o nome do livro: ");
            String nome = LER.nextLine();
            System.out.println("Digite o nome do autor: ");
            String autor = LER.nextLine();
            System.out.println("Digite o nome da editora: ");
            String editora = LER.nextLine();
            System.out.println("Digite o número de cópias: ");
            int copias = LER.nextInt();
            biblioteca.addLivro(new Livro(nome, new Autor(autor), new Editora(editora), copias));
            System.out.println("Livro adicionado com sucesso!");
            voltarProMenu(operacao, biblioteca, editora, 2);
            limparTela();
        }else if(operacao == '2'){
            verLivrosDisponiveis(biblioteca, operacao);
            System.out.println("Digite o número do livro que deseja remover: ");
            operacao = lerComRestricaoCRec(operacao, biblioteca);
            biblioteca.removerLivro(biblioteca.getLivros().get(Character.getNumericValue(operacao) - 1));
            System.out.println("Livro removido com sucesso!");
            voltarProMenu(operacao, biblioteca, null, 2);
            limparTela();
        }else if(operacao == '3'){
            verLivrosDisponiveis(biblioteca, operacao);
            System.out.println();
            voltarProMenu(operacao, biblioteca, null, 2);
            limparTela();
        }else if(operacao == '4'){
            System.out.printf("\nEmpréstimos feitos:\n");
            for(Emprestimo emprestimo : biblioteca.getEmprestimos()){
                int cont = 0;
                System.out.printf("Data do empréstimo: %s | Data de devolução: %s | Status: %s\n", emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao(), emprestimo.getEstadoEmprestimo());
                System.out.println("  Livros emprestados:");
                for (Livro livro : emprestimo.getLivrosEmprestados()) {
                    cont++;
                    System.out.printf("    %d. %s (Autor: %s, Editora: %s)\n\n", cont, livro.getNome(), livro.getAutor().getNome(), livro.getEditora().getNome());
                }
                    
            }
            voltarProMenu(operacao, biblioteca, null, 2);
        }else{
            limparTela();
            return;
        }
    }

    public static void menuGerente(Biblioteca biblioteca, String operacaoA, Character operacao){
        System.out.printf("\n1. Contratar funcionários\n2. Demitir funcionários\n3. Cadastrar clientes\n4. Remover Clientes\n5. Ver Funcionários\n6. Ver Clientes\n7. Ver Livros\n8. Ver Emprestimos\n9. Fazer empréstimo\n10. Logout\n");  
        operacaoA = lerComRestricaoERec(operacaoA);
        String nome = null;
        String telefone = null;
        String cpf = null;
        String senha = null;
        String email = null;

        if(operacaoA.equals(1)){
            login(nome, email, senha, telefone, cpf, biblioteca, '3');
            System.out.println("Funcionário contratado com sucesso!");
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(2)){
            for(Funcionario funcionario : biblioteca.getFuncionarios()){
                System.out.println(biblioteca.getFuncionarios().indexOf(funcionario)+1 + ". " + funcionario.getNome());
            }
            System.out.println("Digite o número do funcionário que deseja demitir: ");
            operacao = lerComRestricaoFRec(operacao, biblioteca);
            biblioteca.getFuncionarios().remove(Character.getNumericValue(operacao) - 1);
            System.out.println("Funcionário demitido com sucesso!");
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(3)){
            login(nome, email, senha, telefone, cpf, biblioteca, '1');
            System.out.println("Cliente cadastrado com sucesso!");
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(4)){
            for(Cliente cliente : biblioteca.getClientes()){
                System.out.println(biblioteca.getClientes().indexOf(cliente)+1 + ". " + cliente.getNome());
            }
            System.out.println("Digite o número do cliente que deseja remover: ");
            operacao = lerComRestricaoFRec(operacao, biblioteca);
            biblioteca.getClientes().remove(Character.getNumericValue(operacao) - 1);
            System.out.println("Cliente removido com sucesso!");
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(5)){
            System.out.println("Funcionários:");
            for(Funcionario funcionario : biblioteca.getFuncionarios()){
                System.out.println("- " + funcionario.getNome());
            }
            System.out.println();
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if (operacaoA.equals(6)) {
            System.out.println("Clientes:");
            for(Cliente cliente : biblioteca.getClientes()){
                System.out.println("- " + cliente.getNome());
            }
            System.out.println();
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(7)){
            verLivrosDisponiveis(biblioteca, operacao);
            System.out.println();
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(8)){
            System.out.printf("\nEmpréstimos feitos:\n");
            for(Emprestimo emprestimo : biblioteca.getEmprestimos()){
                int cont = 0;
                System.out.printf("Cliente: %s | Data do empréstimo: %s | Data de devolução: %s | Status: %s\n", emprestimo.getCliente().getNome(), emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao(), emprestimo.getEstadoEmprestimo());
                System.out.println("  Livros emprestados:");
                for (Livro livro : emprestimo.getLivrosEmprestados()) {
                    cont++;
                    System.out.printf("    %d. %s (Autor: %s, Editora: %s)\n\n", cont, livro.getNome(), livro.getAutor().getNome(), livro.getEditora().getNome());
                }
            }
            System.out.println();
            voltarProMenu(operacao, biblioteca, operacaoA, 3);
            limparTela();
        }else if(operacaoA.equals(9)){
            login(nome, email, senha, telefone, cpf, biblioteca, '1');
            biblioteca.addEmprestimo(new Emprestimo(biblioteca.getClientes().getLast(), LocalDate.now(), LocalDate.now().plusDays(7)));
            biblioteca.getClientes().getLast().addEmprestimo(biblioteca.getEmprestimos().getLast());
            fazerEmprestimo(biblioteca,  operacao);
            limparTela();
        }else{
            limparTela();
            return;
        }
    }

    public static void login(String nome, String senha, String email, String telefone, String cpf, Biblioteca biblioteca, Character operacao){
        LER.nextLine();
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
        if(operacao == '1'){
            biblioteca.addCliente(new Cliente(nome, email, senha, telefone, cpf));
        }else if(operacao == '2'){
            biblioteca.addFuncionario(new Funcionario(nome, email, senha, telefone, cpf));
        }else{
            biblioteca.addGerente(new Gerente(nome, email, senha, telefone, cpf));
        }
        limparTela();
        System.out.printf("\nLogin Criado!\n\nO que deseja: ");
    }

    public static void limparTela(){
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");
    }

    public static Character lerComRestricaoARec(Character operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2' || operacao == '3' || operacao == '4'){
            return operacao;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoARec(operacao);

    }

    public static Character lerComRestricaoBRec(Character operacao){
        operacao = LER.next().charAt(0);
        if(operacao == '1' || operacao == '2' || operacao == '3' || operacao == '4' || operacao == '5'){
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

    public static String lerComRestricaoERec(String operacaoA){
        operacaoA = LER.next();
        if(operacaoA.equals("1") || operacaoA.equals("2") || operacaoA.equals("3") || operacaoA.equals("4") || operacaoA.equals("5") || operacaoA.equals("6") || operacaoA.equals("7") || operacaoA.equals("8") || operacaoA.equals("9") || operacaoA.equals("10")){
            return operacaoA;
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoERec(operacaoA);
    }

    public static Character lerComRestricaoFRec(Character operacao, Biblioteca biblioteca){
        operacao = LER.next().charAt(0);
        if(Character.isDigit(operacao)){
            if(Character.getNumericValue(operacao) > 0 && Character.getNumericValue(operacao) <= biblioteca.getFuncionarios().size()){
                return operacao;
            }
            
        }else{
            System.out.println("Digite uma entrada válida!");
        }
        return lerComRestricaoFRec(operacao, biblioteca);
    }

    public static void menuCliente(Biblioteca biblioteca, Character operacao){
        System.out.printf("\n1. Fazer um empréstimo\n2. Ver empréstimos feitos\n3. Livros em posse\n4. Meus dados\n5. Logout\n");
        operacao = lerComRestricaoBRec(operacao);
        
        if(operacao == '1'){
            limparTela();
            biblioteca.addEmprestimo(new Emprestimo(biblioteca.getClientes().getLast(), LocalDate.now(), LocalDate.now().plusDays(7)));
            biblioteca.getClientes().getLast().addEmprestimo(biblioteca.getEmprestimos().getLast());
            fazerEmprestimo(biblioteca,  operacao);
            limparTela();
        }else if(operacao == '2'){
            limparTela();
            System.out.printf("\nEmpréstimos feitos:\n");
            for(Emprestimo emprestimo : biblioteca.getClientes().getLast().getEmprestimosFeitos()){
                int cont = 0;
                System.out.printf("Data do empréstimo: %s | Data de devolução: %s | Status: %s\n", emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao(), emprestimo.getEstadoEmprestimo());
                System.out.println("  Livros emprestados:");
                for (Livro livro : emprestimo.getLivrosEmprestados()) {
                    cont++;
                    System.out.printf("    %d. %s (Autor: %s, Editora: %s)\n\n", cont, livro.getNome(), livro.getAutor().getNome(), livro.getEditora().getNome());
                }
                    
            }
            voltarProMenu(operacao, biblioteca, null, 1);
            limparTela();
        }else if(operacao == '3'){
            limparTela();
            biblioteca.getClientes().getLast().verLivrosEmPosse();
            System.out.println();
            voltarProMenu(operacao, biblioteca, null, 1);
            limparTela();
        }else if(operacao == '4'){
            limparTela();
            System.out.printf("\nNome: %s\nCPF: %s\nTelefone: %s\nEmail: %s\nSenha: %s\n", biblioteca.getClientes().getLast().getNome(), biblioteca.getClientes().getLast().getCpf(), biblioteca.getClientes().getLast().getTelefone(), biblioteca.getClientes().getLast().getEmail(), biblioteca.getClientes().getLast().getSenha());
            voltarProMenu(operacao, biblioteca, null, 1);
            limparTela();
        }else{
            limparTela();
            return;
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

    public static void voltarProMenu(Character operacao, Biblioteca biblioteca, String operacaoA, int perfil){
        System.out.println("Deseja encerrar a sessão? (S/N)");
        operacao = lerComRestricaoDRec(operacao);
        if(operacao == 'S'){
            System.out.println("Obrigado por usar o sistema!");
            System.exit(0);
        }else{
            limparTela();
            if(perfil == 1) {
                menuCliente(biblioteca, operacao);
            }else if(perfil == 2) {
                menuFuncionario(biblioteca, operacao);
            }else{
                menuGerente(biblioteca, operacaoA, operacao);
            }
           
        }
    }

    public static void fazerEmprestimo(Biblioteca biblioteca, Character operacao){
        verLivrosDisponiveis(biblioteca, operacao);
        System.out.printf("\nDigite o número do livro que deseja pegar emprestado: ");
        operacao = lerComRestricaoCRec(operacao, biblioteca);
        biblioteca.getEmprestimos().getLast().addLivro(biblioteca.getLivros().get(Character.getNumericValue(operacao) - 1));
        biblioteca.getClientes().getLast().addLivroEmPosse(biblioteca.getLivros().get(Character.getNumericValue(operacao) - 1));
        System.out.printf("\nEmpréstimo realizado com sucesso!\n");
        System.out.println("Deseja fazer outro empréstimo? (S/N)");
        operacao = lerComRestricaoDRec(operacao);
        if(operacao == 'S'){
            limparTela();
            fazerEmprestimo(biblioteca, operacao);
        }else{
            limparTela();
            System.out.println("Data de devolução: " + biblioteca.getEmprestimos().getLast().getDataDevolucao()+"\n");
            voltarProMenu(operacao, biblioteca, null, 1);

        }

    }

    public static void imprimirCabecalho(){
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
        System.out.println("3. Navegar como Gerente");
        System.out.println("4. Sair");
        

    }

    public static void preSetLivros(Biblioteca biblioteca){
        biblioteca.addLivro(new Livro("1984", new Autor("George Orwell"), new Editora("Companhia das Letras"), 3));
        biblioteca.addLivro(new Livro("O Senhor dos Anéis", new Autor("J.R.R. Tolkien"), new Editora("HarperCollins"), 2));
        biblioteca.addLivro(new Livro("Dom Casmurro", new Autor("Machado de Assis"), new Editora("Penguin-Companhia"), 4));
        biblioteca.addLivro(new Livro("A Revolução dos Bichos", new Autor("George Orwell"), new Editora("Companhia das Letras"), 5));
        biblioteca.addLivro(new Livro("O Pequeno Príncipe", new Autor("Antoine de Saint-Exupéry"), new Editora("Agir"), 6));
        biblioteca.addLivro(new Livro("Fahrenheit 451", new Autor("Ray Bradbury"), new Editora("Companhia das Letras"), 3));
        biblioteca.addLivro(new Livro("Cem Anos de Solidão", new Autor("Gabriel García Márquez"), new Editora("Record"), 4));
        biblioteca.addLivro(new Livro("O Alquimista", new Autor("Paulo Coelho"), new Editora("Rocco"), 5));
        
    }

}
