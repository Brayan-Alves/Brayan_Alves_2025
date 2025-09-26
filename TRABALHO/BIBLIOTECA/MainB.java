package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;

public class MainB{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca System");
        System.out.printf("=================Bem-vindo à Biblioteca System!=================\n\n");
        System.out.printf("O que deseja fazer?\n");
        System.out.printf("1 - Acessar como Gerente\n");
        System.out.printf("2 - Acessar como Funcionário\n");
        System.out.printf("3 - Acessar como Cliente\n");
        System.out.println("4 - Sair");
        
        int indexLogin = 0;
        while (true) {
            int entrada = lerRestritoA();
            if(entrada == 1){
                indexLogin = escolherLogin(biblioteca, entrada);
                menuGerente(biblioteca);
            }else if(entrada == 2){
                indexLogin = escolherLogin(biblioteca, entrada);
                menuFuncionario(biblioteca);
            }else if(entrada == 3){
                indexLogin = escolherLogin(biblioteca, entrada);
                menuCliente(biblioteca);
            }else{
                System.out.println("Saindo...");
                System.exit(0);
            }
        }

        
    }

    public static void menuGerente(Biblioteca biblioteca){
        System.out.printf("Menu do Gerente\n");
        System.out.println("1 - Gerenciar Gerentes");
        System.out.println("2 - Gerenciar Funcionários");
        System.out.println("3 - Gerenciar Clienetes");
        System.out.println("4 - Gerenciar Livro");
        System.out.println("5 - Voltar pro Menu");
        System.out.println("6 - Sair");
        // System.out.printf("1 - Cadastrar Funcionário\n");
        // System.out.printf("2 - Remover Funcionário\n");
        // System.out.printf("3 - Cadastrar Livro\n");
        // System.out.printf("4 - Remover Livro\n");
        // System.out.printf("5 - Cadastrar Cliente\n");
        // System.out.printf("6 - Remover Cliente\n");
        // System.out.printf("7 - Cadastrar Gerente\n");
        // System.out.printf("8 - Remover Gerente\n");
        // System.out.println("9 - Alterar Salário");
        // System.out.printf("10 - Voltar ao Menu Principal\n");
        // System.out.printf("11 - Sair\n");

        int entrada = lerRestritoL();

        if(entrada == 1){
            System.out.println("Gerenciar Gerentes");
            
        }
        // if(entrada == 1){
        //     System.out.printf("Cadastrar Funcionário\n");
        //     String nome, email, senha, telefone, cpf; 
        //     double salario;
        //     System.out.printf("Nome: ");
        //     nome = LER.nextLine();
        //     System.out.printf("Email: ");
        //     email = LER.nextLine();
        //     System.out.printf("Senha: ");
        //     senha = LER.nextLine();
        //     System.out.printf("Telefone: ");
        //     telefone = LER.nextLine();
        //     System.out.printf("CPF: ");
        //     cpf = LER.nextLine();
        //     System.out.println("Salário: ");
        //     salario = LER.nextDouble();
        //     System.out.println("Turno:\n1 - Manhã\n2 - Tarde\n3 - Noite");
        //     entrada = lerRestritoC();
        //     if(entrada == 1){
        //         biblioteca.addFuncionario(new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.MANHA, salario)); 
        //     }else if(entrada == 2){
        //         biblioteca.addFuncionario(new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.TARDE, salario));
        //     }else{
        //         biblioteca.addFuncionario(new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.NOITE, salario));
        //     }
        //     System.out.println("Funcionário cadastrado com sucesso!");
        // }else if(entrada == 2){
        //     if(biblioteca.getFuncionarios().isEmpty()){
        //         System.out.println("Não há funcionários cadastrados na biblioteca!");
        //         return;
        //     }else{
        //         System.out.printf("Remover Funcionário\n");
        //         for(int i = 0; i < biblioteca.getFuncionarios().size(); i++){
        //             System.out.printf((i+1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
        //         }
        //         System.out.println("Escolha o funcionário que deseja remover:");
        //         entrada = lerRestritoD(biblioteca);
        //         biblioteca.removeFuncionario(biblioteca.getFuncionarios().get(entrada-1));
        //         System.out.println("Funcionário removido com sucesso!");
        //     }
        // }else if(entrada == 3){
        //     System.out.printf("Cadastrar Livro\n");
        //     String titulo, autor, editora;
        //     int copiasNoAcervo;
        //     System.out.printf("Título: ");
        //     titulo = LER.nextLine();
        //     System.out.printf("Autor: ");
        //     autor = LER.nextLine();
        //     System.out.printf("Editora: ");
        //     editora = LER.nextLine();
        //     System.out.printf("Número de cópias no acervo: ");
        //     copiasNoAcervo = LER.nextInt();
        //     Livro livro = new Livro(titulo, new Autor(autor), new Editora(editora), copiasNoAcervo);
        //     biblioteca.addLivro(livro);
        //     System.out.println("Livro cadastrado com sucesso!");
        // }else if(entrada == 4){
        //     if(biblioteca.getLivros().isEmpty()){
        //         System.out.println("Não há livros cadastrados na biblioteca!");
        //         return;
        //     }else{
        //         System.out.printf("Remover Livro\n");
        //         for(int i = 0; i < biblioteca.getLivros().size(); i++){
        //             System.out.printf((i+1) + " - " + biblioteca.getLivros().get(i).getNome() + "\n");
        //         }
        //         System.out.println("Escolha o livro que deseja remover:");
        //         entrada = lerRestritoE(biblioteca);
        //         biblioteca.removeLivro(biblioteca.getLivros().get(entrada-1));
        //         System.out.println("Livro removido com sucesso!");
        //     }
        // }else if(entrada == 5){
        //     System.out.printf("Cadastrar Cliente\n");
        //     String nome, email, senha, telefone, cpf;
        //     System.out.printf("Nome: ");
        //     nome = LER.nextLine();
        //     System.out.printf("Email: ");
        //     email = LER.nextLine();
        //     System.out.printf("Senha: ");
        //     senha = LER.nextLine();
        //     System.out.printf("Telefone: ");
        //     telefone = LER.nextLine();
        //     System.out.printf("CPF: ");
        //     cpf = LER.nextLine();
        //     Cliente cliente = new Cliente(nome, email, senha, telefone, cpf);
        //     biblioteca.addCliente(cliente);
        //     System.out.println("Cliente cadastrado com sucesso!");
        // }else if(entrada == 6){
        //     if(biblioteca.getClientes().size() == 0){
        //         System.out.println("Não há clientes cadastrados na biblioteca!");
        //         return;
        //     }else{
        //         System.out.printf("Remover Cliente\n");
        //         for(int i = 0; i < biblioteca.getClientes().size(); i++){
        //             System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
        //         }
        //         System.out.println("Escolha o cliente que deseja remover:");
        //         entrada = lerRestritoF(biblioteca);
        //         biblioteca.removeCliente(biblioteca.getClientes().get(entrada-1));
        //         System.out.println("Cliente removido com sucesso!");
        //     }
        // }else if(entrada == 7){
        //     System.out.printf("Cadastrar Gerente\n");
        //     String nome, email, senha, telefone, cpf;
        //     System.out.printf("Nome: ");
        //     nome = LER.nextLine();
        //     System.out.printf("Email: ");
        //     email = LER.nextLine();
        //     System.out.printf("Senha: ");
        //     senha = LER.nextLine();
        //     System.out.printf("Telefone: ");
        //     telefone = LER.nextLine();
        //     System.out.printf("CPF: ");
        //     cpf = LER.nextLine();
        //     Gerente gerente = new Gerente(nome, email, senha, telefone, cpf);
        //     biblioteca.addGerente(gerente);
        //     System.out.println("Gerente cadastrado com sucesso!");
        // }else if(entrada == 8){
        //     if(biblioteca.getGerentes().size() == 1){
        //         System.out.println("Não é possível remover o último gerente da biblioteca!");
        //         return;
        //     }else{
        //         System.out.printf("Remover Gerente\n");
        //         for(int i = 0; i < biblioteca.getGerentes().size(); i++){
        //             System.out.printf((i+1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
        //         }
        //         System.out.println("Escolha o gerente que deseja remover:");
        //         entrada = lerRestritoG(biblioteca);
        //         biblioteca.removeGerente(biblioteca.getGerentes().get(entrada-1));
        //         System.out.println("Gerente removido com sucesso!");
        //     }
        // }else if(entrada == 9){
        //     System.out.println("Alterar Salário");
        //     System.out.println("Mudar sálario de:\n1 - Funcionário\n2 - Gerente");
        //     entrada = lerRestritoH();
        //     if(entrada == 1){
        //         if(biblioteca.getFuncionarios().isEmpty()){
        //             System.out.println("Não há funcionários cadastrados na biblioteca!");
        //             return;
        //         }else{
        //             System.out.printf("Alterar Salário do Funcionário\n");
        //             for(int i = 0; i < biblioteca.getFuncionarios().size(); i++){
        //                 System.out.printf((i+1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
        //             }
        //             System.out.println("Escolha o funcionário que deseja alterar o salário:");
        //             entrada = lerRestritoD(biblioteca);
        //             System.out.println("Novo salário:");
        //             double salario = LER.nextDouble();
        //             biblioteca.getFuncionarios().get(entrada-1).setSalario(salario);
        //             System.out.println("Salário alterado com sucesso!");
        //         }
        //     }else{
        //         if(biblioteca.getGerentes().isEmpty()){
        //             System.out.println("Não há gerentes cadastrados na biblioteca!");
        //             return;
        //         }else{
        //             System.out.printf("Alterar Salário do Gerente\n");
        //             for(int i = 0; i < biblioteca.getGerentes().size(); i++){
        //                 System.out.printf((i+1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
        //             }
        //             System.out.println("Escolha o gerente que deseja alterar o salário:");
        //             entrada = lerRestritoG(biblioteca);
        //             System.out.println("Novo salário:");
        //             double salario = LER.nextDouble();
        //             biblioteca.getGerentes().get(entrada-1).setSalario(salario);
        //             System.out.println("Salário alterado com sucesso!");
        //         }
        //     }
        // }else if(entrada == 10){
        //     return;
        // }else{
        //     System.out.println("Saindo...");
        //     System.exit(0);
        // }
    }

    public static void menuFuncionario(Biblioteca biblioteca){
        System.out.println("Menu do Funcionário");
        //funcionario pode add livro, remover livro, cadastrar cliente, remover cliente, registrar empréstimo, registrar devolução
        System.out.printf("1 - Cadastrar Livro\n");
        System.out.printf("2 - Remover Livro\n");
        System.out.printf("3 - Cadastrar Cliente\n");
        System.out.printf("4 - Remover Cliente\n");
        System.out.printf("5 - Registrar Empréstimo\n");
        System.out.printf("6 - Registrar Devolução\n");
        System.out.printf("7 - Voltar ao Menu Principal\n");
        System.out.printf("8 - Sair\n");
        int entrada = lerRestritoI();
        if(entrada == 1){
            System.out.printf("Cadastrar Livro\n");
            String titulo, autor, editora;
            int copiasNoAcervo;
            System.out.printf("Título: ");
            titulo = LER.nextLine();
            System.out.printf("Autor: ");
            autor = LER.nextLine();
            System.out.printf("Editora: ");
            editora = LER.nextLine();
            System.out.printf("Número de cópias no acervo: ");
            copiasNoAcervo = LER.nextInt();
            Livro livro = new Livro(titulo, new Autor(autor), new Editora(editora), copiasNoAcervo);
            biblioteca.addLivro(livro);
            System.out.println("Livro cadastrado com sucesso!");
        }else if(entrada == 2){
            if(biblioteca.getLivros().isEmpty()){
                System.out.println("Não há livros cadastrados na biblioteca!");
                return;
            }else{
                System.out.printf("Remover Livro\n");
                for(int i = 0; i < biblioteca.getLivros().size(); i++){
                    System.out.printf((i+1) + " - " + biblioteca.getLivros().get(i).getNome() + "\n");
                }
                System.out.println("Escolha o livro que deseja remover:");
                entrada = lerRestritoE(biblioteca); 
                biblioteca.removeLivro(biblioteca.getLivros().get(entrada-1));
                System.out.println("Livro removido com sucesso!");
            }
        }else if(entrada == 3){
            System.out.printf("Cadastrar Cliente\n");
            String nome, email, senha, telefone, cpf;
            System.out.printf("Nome: ");
            nome = LER.nextLine();
            System.out.printf("Email: ");
            email = LER.nextLine();
            System.out.printf("Senha: ");
            senha = LER.nextLine();
            System.out.printf("Telefone: ");
            telefone = LER.nextLine();
            System.out.printf("CPF: ");
            cpf = LER.nextLine();
            Cliente cliente = new Cliente(nome, email, senha, telefone, cpf);
            biblioteca.addCliente(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }else if(entrada == 4){
            if(biblioteca.getClientes().isEmpty()){
                System.out.println("Não há clientes cadastrados na biblioteca!");
                return;
            }else{
                System.out.printf("Remover Cliente\n");
                for(int i = 0; i < biblioteca.getClientes().size(); i++){
                    System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
                }
                System.out.println("Escolha o cliente que deseja remover:");
                entrada = lerRestritoF(biblioteca);
                biblioteca.removeCliente(biblioteca.getClientes().get(entrada-1));
                System.out.println("Cliente removido com sucesso!");
            }
        }else if(entrada == 5){
            if(biblioteca.getClientes().isEmpty()){
                System.out.println("Não há clientes cadastrados na biblioteca!");
                return;
            }else if(biblioteca.getLivros().isEmpty()){
                System.out.println("Não há livros cadastrados na biblioteca!");
                return;
            }else{
                System.out.printf("Registrar Empréstimo\n");
                System.out.println("Escolha o cliente que fará o empréstimo:");
                for(int i = 0; i < biblioteca.getClientes().size(); i++){
                    System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
                }
                entrada = lerRestritoF(biblioteca);
                Cliente cliente = biblioteca.getClientes().get(entrada-1);
                Emprestimo emprestimo = new Emprestimo(cliente, LocalDate.now(), LocalDate.now().plusDays(7));
                while(true){
                    System.out.println("Escolha o livro que deseja emprestar (ou 0 para finalizar):");
                    for(int i = 0; i < biblioteca.getLivros().size(); i++){
                        System.out.printf((i+1) + " - " + biblioteca.getLivros().get(i).getNome() + " (Cópias disponíveis: " + biblioteca.getLivros().get(i).getCopiasNoAcervo() + ")\n");
                    }
                    entrada = lerRestritoJ(biblioteca);
                    if(entrada == 0){
                        break;
                    }
                    entrada = lerRestritoE(biblioteca);
                    Livro livro = biblioteca.getLivros().get(entrada-1);
                    if(livro.getCopiasNoAcervo() > 0){
                        emprestimo.addLivro(livro);
                        cliente.addLivroEmPosse(livro);
                        System.out.println("Livro adicionado ao empréstimo!");
                    }else{
                        System.out.println("Não há cópias disponíveis desse livro!");
                    }
                }
                if(emprestimo.getLivrosEmprestados().isEmpty()){
                    System.out.println("Nenhum livro foi adicionado ao empréstimo. Operação cancelada.");
                }else{
                    biblioteca.addEmprestimo(emprestimo);
                    cliente.addEmprestimo(emprestimo);
                    System.out.println("Empréstimo registrado com sucesso!");
                }
            }
        }else if(entrada == 6){
            if(biblioteca.getClientes().isEmpty()){
                System.out.println("Não há clientes cadastrados na biblioteca!");
                return;
            }else if(biblioteca.getLivros().isEmpty()){
                System.out.println("Não há livros cadastrados na biblioteca!");
                return;
            }else if(biblioteca.getEmprestimos().isEmpty()){
                System.out.println("Não há empréstimos registrados na biblioteca!");
                return;
            }else{
                System.out.printf("Registrar Devolução\n");
                System.out.println("Escolha o cliente que fará a devolução:");
                for(int i = 0; i < biblioteca.getClientes().size(); i++){
                    System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
                }
                entrada = lerRestritoF(biblioteca);
                Cliente cliente = biblioteca.getClientes().get(entrada-1);
                if(cliente.getLivrosEmPosse().isEmpty()){
                    System.out.println("Esse cliente não possui livros em posse!");
                    return;
                }else{
                    //tipo nesse codigo que eu to fazendo a pessoa n delvolve so um livro ela devolve todos os livros de um certo imprestimo
                    System.out.println("Escolha o empréstimo que deseja devolver:");
                    for(int i = 0; i < cliente.getEmprestimosFeitos().size(); i++){
                        Emprestimo emp = cliente.getEmprestimosFeitos().get(i);
                        System.out.printf((i+1) + " - Empréstimo de " + emp.getDataEmprestimo() + " com " + emp.getLivrosEmprestados().size() + " livros. Status: " + emp.getEstadoEmprestimo() + "\n");
                        System.out.println("  Livros:");
                        for(Livro l : emp.getLivrosEmprestados()){
                            System.out.printf("   - " + l.getNome() + "\n");
                        }
                    }
                    entrada = lerRestritoK(cliente);
                    Emprestimo emprestimoParaDevolver = cliente.getEmprestimosFeitos().get(entrada-1);
                    if(emprestimoParaDevolver.getEstadoEmprestimo() == Emprestimo.Status.DEVOLVIDO){
                        System.out.println("Esse empréstimo já foi devolvido!");
                        return;
                    }else{
                        Emprestimo.devolverEmprestimo(emprestimoParaDevolver);
                        System.out.println("Empréstimo devolvido com sucesso!");
                    }

                }
            }
        }else if(entrada == 7){
            return;
        }else{
            System.out.println("Saindo...");
            System.exit(0);
        }
    }

    public static void menuCliente(Biblioteca biblioteca){
        System.out.println("Menu do Cliente");
        //cliente pode ver livros disponíveis, ver seus empréstimos e ver livros em posse
        System.out.printf("1 - Ver Livros Disponíveis\n");
        System.out.printf("2 - Ver Meus Empréstimos\n");
        System.out.printf("3 - Ver Meus Livros em Posse\n");
        System.out.printf("4 - Voltar ao Menu Principal\n");
        System.out.printf("5 - Sair\n");
        int entrada = lerRestritoL();
        if(entrada == 1){
            if(biblioteca.getLivros().isEmpty()){
                System.out.println("Não há livros cadastrados na biblioteca!");
                return;
            }else{
                System.out.printf("Livros Disponíveis\n");
                for(int i = 0; i < biblioteca.getLivros().size(); i++){
                    Livro livro = biblioteca.getLivros().get(i);
                    System.out.printf((i+1) + " - " + livro.getNome() + " (Cópias disponíveis: " + livro.getCopiasNoAcervo() + ")\n");
                }
            }
        }else if(entrada == 2){
            if(){
                System.out.println("Não há clientes cadastrados na biblioteca!");
                return;
            }else{
                System.out.printf("Ver Meus Empréstimos\n");
                System.out.println("Escolha o cliente:");
                for(int i = 0; i < biblioteca.getClientes().size(); i++){
                    System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
                }
                entrada = lerRestritoF(biblioteca);
                Cliente cliente = biblioteca.getClientes().get(entrada-1);
                if(cliente.getEmprestimosFeitos().isEmpty()){
                    System.out.println("Esse cliente não possui empréstimos!");
                    return;
                }else{
                    System.out.printf("Empréstimos de " + cliente.getNome() + "\n");
                    for(Emprestimo emp : cliente.getEmprestimosFeitos()){
                        System.out.printf("Empréstimo de " + emp.getDataEmprestimo() + " com " + emp.getLivrosEmprestados().size() + " livros. Status: " + emp.getEstadoEmprestimo() + "\n");
                        System.out.println("  Livros:");
                        for(Livro l : emp.getLivrosEmprestados()){
                            System.out.printf("   - " + l.getNome() + "\n");
                        }
                    }
                }
            }
        }else if(entrada == 3){
        }
    }











    public static int escolherLogin(Biblioteca biblioteca, int tipo){
        if(tipo == 1){
            System.out.println("Escolha o gerente:");
            for(int i = 0; i < biblioteca.getGerentes().size(); i++){
                System.out.printf((i+1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
            }
            return lerRestritoG(biblioteca);

        }else if(tipo == 2){
            System.out.println("Escolha o funcionário:");
            for (int i = 0; i < biblioteca.getFuncionarios().size(); i++) {
                System.out.printf((i+1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
            }
            return lerRestritoD(biblioteca);
        }else{
            System.out.println("Escolha o cliente:");
            for (int i = 0; i < biblioteca.getClientes().size(); i++) {
                System.out.printf((i+1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
            }
            return lerRestritoF(biblioteca);
        }
    }




    public static int lerRestritoA(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 5){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoA();
        }
    }
    public static int lerRestritoB(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 12){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoB();
        }
    }
    public static int lerRestritoC(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 4){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoC();
        }
    }
    public static int lerRestritoD(Biblioteca biblioteca){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada <= biblioteca.getFuncionarios().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoD(biblioteca);
        }
    }
    public static int lerRestritoE(Biblioteca biblioteca){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada <= biblioteca.getLivros().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoE(biblioteca);
        }
    }
    public static int lerRestritoF(Biblioteca biblioteca){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada <= biblioteca.getClientes().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoF(biblioteca);
        }
    }
    public static int lerRestritoG(Biblioteca biblioteca){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada <= biblioteca.getGerentes().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoG(biblioteca);
        }
    }
    public static int lerRestritoH(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 3){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoH();
        }
    }
    public static int lerRestritoI(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 9){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoI();
        }
    }
    public static int lerRestritoJ(Biblioteca biblioteca){
        int entrada = LER.nextInt();
        if(entrada >= 0 && entrada <= biblioteca.getLivros().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoJ(biblioteca);
        }
    }
    public static int lerRestritoK(Cliente cliente){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada <= cliente.getEmprestimosFeitos().size()){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoK(cliente);
        }
    }
    public static int lerRestritoL(){
        int entrada = LER.nextInt();
        if(entrada > 0 && entrada < 7){
            return entrada;
        }else{
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoL();
        }
    }
    public static void limparBuffer(){
        LER.nextLine();
    }


    
}