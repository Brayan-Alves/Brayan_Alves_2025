package TRABALHO.BIBLIOTECA;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca System");
        biblioteca.addGerente(
                new Gerente("Brayan", "brayanalvesdossantos67@gmail.com", "senha123", "45999849552", "15842056950"));

        int indexLogin = 0;
        while (true) {
            imprimirCabecalho();
            int entrada = lerRestritoA();
            limparTela();
            if (entrada == 1) {
                indexLogin = escolherLogin(biblioteca, entrada);
                limparTela();
                menuGerente(biblioteca);
            } else if (entrada == 2) {
                indexLogin = escolherLogin(biblioteca, entrada);
                if (indexLogin == 0) {
                    continue;
                }
                limparTela();
                menuFuncionario(biblioteca);
            } else if (entrada == 3) {
                indexLogin = escolherLogin(biblioteca, entrada);
                if (indexLogin == 0) {
                    continue;
                }
                limparTela();
                menuCliente(biblioteca, indexLogin);
            } else {
                System.out.println("Saindo...");
                System.exit(0);
            }
        }

    }

    public static void menuGerente(Biblioteca biblioteca) {
        System.out.printf("Menu do Gerente\n");
        System.out.println("1 - Gerenciar Gerentes");
        System.out.println("2 - Gerenciar Funcionários");
        System.out.println("3 - Gerenciar Clientes");
        System.out.println("4 - Gerenciar Livro");
        System.out.println("5 - Voltar pro Menu");
        System.out.println("6 - Sair");

        int entrada = lerRestritoB();
        limparTela();

        if (entrada == 1) {
            System.out.println("Gerenciar Gerentes");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Remover Gerente");
            System.out.println("3 - Editar Gerente");
            System.out.println("3 - Mudar Salário do Gerente");
            System.out.println("4 - Voltar");

            entrada = lerRestritoA();
            limparTela();
            if (entrada == 1) {
                cadastrarGerente(entrada, biblioteca);
            } else if (entrada == 2) {
                removerGerente(biblioteca, entrada);
            } else if (entrada == 3) {
                editarGerente(biblioteca, entrada);
            } else if (entrada == 4) {
                mudarSalario(biblioteca, entrada, 1);
            } else {
                return;
            }
        } else if (entrada == 2) {
            System.out.println("Gerenciar Funcionários");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Remover Funcionário");
            System.out.println("3 - Editar Funcionário");
            System.out.println("4 - Mudar Salário do Funcionário");
            System.out.println("4 - Voltar");

            entrada = lerRestritoA();
            limparTela();
            if (entrada == 1) {
                cadastrarFuncionario(biblioteca, entrada);
            } else if (entrada == 2) {
                removerFuncionario(biblioteca, entrada);
            } else if (entrada == 3) {
                mudarSalario(biblioteca, entrada, 2);
            } else {
                return;
            }
        } else if (entrada == 3) {
            System.out.println("Gerenciar Clientes");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Editar Cliente");
            System.out.println("4 - Voltar");
            entrada = lerRestritoA();

            if (entrada == 1) {
                cadastrarCliente(biblioteca);
            } else if (entrada == 2) {
                removerCliente(biblioteca, entrada);
            } else if (entrada == 3) {
                editarCliente(biblioteca, entrada);
            } else {
                return;
            }

        } else if (entrada == 4) {
            System.out.println("Gerenciar Livros");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Editar Livro");
            System.out.println("4 - Voltar");

            entrada = lerRestritoA();
            limparTela();
            if (entrada == 1) {
                cadastrarLivro(biblioteca);
            } else if (entrada == 2) {
                removerLivro(biblioteca, entrada);
            } else if (entrada == 3) {
                editarLivro(biblioteca, entrada);
            } else {
                return;
            }
        } else if (entrada == 5) {
            return;
        } else {
            System.out.println("Saindo...");
            System.exit(0);
        }

    }

    public static void menuFuncionario(Biblioteca biblioteca) {
        System.out.println("Menu do Funcionário");
        System.out.println("1 - Gerenciar Livros");
        System.out.println("2 - Gerenciar Clientes");
        System.out.println("3 - Registrar Empréstimo");
        System.out.println("4 - Registrar Devolução");
        System.out.println("5 - Voltar pro Menu");
        System.out.println("6 - Sair");
        int entrada = lerRestritoB();
        limparTela();
        if (entrada == 1) {
            System.out.println("Gerenciar Livros");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Editar Livro");
            System.out.println("4 - Voltar");

            entrada = lerRestritoA();
            limparTela();
            if (entrada == 1) {
                cadastrarLivro(biblioteca);
            } else if (entrada == 2) {
                removerLivro(biblioteca, entrada);
            } else if (entrada == 3) {
                editarLivro(biblioteca, entrada);
            } else {
                return;
            }
        } else if (entrada == 2) {
            System.out.println("Gerenciar Clientes");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Editar Cliente");
            System.out.println("4 - Voltar");
            entrada = lerRestritoA();
            limparTela();

            if (entrada == 1) {
                cadastrarCliente(biblioteca);
            } else if (entrada == 2) {
                removerCliente(biblioteca, entrada);
            } else if (entrada == 3) {
                editarCliente(biblioteca, entrada);
            } else {
                return;
            }
        } else if (entrada == 3) {
            registrarEmprestimo(biblioteca, entrada);
        } else if (entrada == 4) {
            registrarDevolucao(biblioteca, entrada);
        } else if (entrada == 5) {
            return;
        } else {
            System.out.println("Saindo...");
            System.exit(0);
        }
    }

    public static void menuCliente(Biblioteca biblioteca, int indexLogin) {
        System.out.println("Menu do Cliente");
        System.out.printf("1 - Ver Livros Disponíveis\n");
        System.out.printf("2 - Ver Meus Empréstimos\n");
        System.out.printf("3 - Ver Meus Livros em Posse\n");
        System.out.printf("4 - Voltar ao Menu Principal\n");
        System.out.printf("5 - Sair\n");
        int entrada = lerRestritoI();
        limparTela();
        if (entrada == 1) {
            verLivrosDisponiveis(biblioteca);
        } else if (entrada == 2) {
            verEmprestimos(biblioteca, indexLogin);
        } else if (entrada == 3) {
            verLivrosEmPosse(biblioteca, indexLogin);
        } else if (entrada == 4) {
            return;
        } else {
            System.out.println("Saindo...");
            System.exit(0);

        }
    }

    public static int escolherLogin(Biblioteca biblioteca, int tipo) {
        if (tipo == 1) {
            if (biblioteca.getGerentes().isEmpty()) {
                System.out.println("Nenhum gerente cadastrado no sistema!");
                return 0;
            } else {
                System.out.println("Escolha o gerente:");
                for (int i = 0; i < biblioteca.getGerentes().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
                }
                return lerRestritoC(biblioteca);
            }
        } else if (tipo == 2) {
            if (biblioteca.getFuncionarios().isEmpty()) {
                System.out.println("Nenhum funcionário cadastrado no sistema!");
                return 0;
            } else {
                System.out.println("Escolha o funcionário:");
                for (int i = 0; i < biblioteca.getFuncionarios().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
                }
                return lerRestritoE(biblioteca);
            }
        } else {
            if (biblioteca.getClientes().isEmpty()) {
                System.out.println("Nenhum cliente cadastrado no sistema!");
                return 0;
            } else {
                System.out.println("Escolha o cliente:");
                for (int i = 0; i < biblioteca.getClientes().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
                }
                return lerRestritoG(biblioteca);
            }
        }
    }

    public static void cadastrarGerente(int entrada, Biblioteca biblioteca) {
        System.out.printf("Cadastrar Gerente\n");
        String nome, email, senha, telefone, cpf;
        System.out.printf("Nome: ");
        limparBuffer();
        nome = LER.nextLine();
        System.out.printf("Email: ");
        email = LER.nextLine();
        System.out.printf("Senha: ");
        senha = LER.nextLine();
        System.out.printf("Telefone: ");
        telefone = LER.nextLine();
        System.out.printf("CPF: ");
        cpf = LER.nextLine();
        limparTela();
        Gerente gerente = new Gerente(nome, email, senha, telefone, cpf);
        biblioteca.addGerente(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    public static void removerGerente(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getGerentes().size() == 1) {
            System.out.println("Não é possível remover o último gerente da biblioteca!");
            return;
        } else {
            System.out.printf("Remover Gerente\n");
            for (int i = 0; i < biblioteca.getGerentes().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
            }
            System.out.println("Escolha o gerente que deseja remover:");
            entrada = lerRestritoC(biblioteca);
            limparTela();
            biblioteca.removeGerente(biblioteca.getGerentes().get(entrada - 1));
            System.out.println("Gerente removido com sucesso!");
        }
    }

    public static void editarGerente(Biblioteca biblioteca, int entrada) {
        System.out.println("Editar Gerente");
        if (biblioteca.getGerentes().isEmpty()) {
            System.out.println("Não há gerentes cadastrados na biblioteca!");
            return;
        }
        System.out.printf("Alterar Dados do Gerente\n");
        for (int i = 0; i < biblioteca.getGerentes().size(); i++) {
            System.out.printf((i + 1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
        }
        System.out.println("Escolha o gerente que deseja alterar os dados:");
        entrada = lerRestritoC(biblioteca);
        limparTela();
        Gerente gerente = biblioteca.getGerentes().get(entrada - 1);
        System.out.println("Novo nome (atual: " + gerente.getNome() + "): ");
        limparBuffer();
        String nome = LER.nextLine();
        System.out.println("Novo email (atual: " + gerente.getEmail() + "): ");
        String email = LER.nextLine();
        System.out.println("Nova senha (atual: " + gerente.getSenha() + "): ");
        String senha = LER.nextLine();
        System.out.println("Novo telefone (atual: " + gerente.getTelefone() + "): ");
        String telefone = LER.nextLine();
        System.out.println("Novo CPF (atual: " + gerente.getCpf() + "): ");
        String cpf = LER.nextLine();
        limparTela();
        gerente.setNome(nome);
        gerente.setEmail(email);
        gerente.setSenha(senha);
        gerente.setTelefone(telefone);
        gerente.setCpf(cpf);
        System.out.println("Dados do gerente alterados com sucesso!");
    }

    public static void mudarSalario(Biblioteca biblioteca, int entrada, int tipo) {
        if (tipo == 1) {
            System.out.println("Mudar sálario do Gerente");
            if (biblioteca.getGerentes().isEmpty()) {
                System.out.println("Não há gerentes cadastrados na biblioteca!");
                return;
            } else {
                System.out.printf("Alterar Salário do Gerente\n");
                for (int i = 0; i < biblioteca.getGerentes().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getGerentes().get(i).getNome() + "\n");
                }
                System.out.println("Escolha o gerente que deseja alterar o salário:");
                entrada = lerRestritoC(biblioteca);
                limparTela();
                System.out.println("Novo salário:");
                limparTela();
                double salario = LER.nextDouble();
                biblioteca.getGerentes().get(entrada - 1).setSalario(salario);
                System.out.println("Salário alterado com sucesso!");
            }
        } else {
            System.out.println("Mudar sálario do Funcionário");
            if (biblioteca.getFuncionarios().isEmpty()) {
                System.out.println("Não há funcionários cadastrados na biblioteca!");
                return;
            } else {
                System.out.printf("Alterar Salário do Funcionário\n");
                for (int i = 0; i < biblioteca.getFuncionarios().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
                }
                System.out.println("Escolha o funcionário que deseja alterar o salário:");
                entrada = lerRestritoE(biblioteca);
                limparTela();
                System.out.println("Novo salário:");
                double salario = LER.nextDouble();
                limparTela();
                biblioteca.getFuncionarios().get(entrada - 1).setSalario(salario);
                System.out.println("Salário alterado com sucesso!");
            }
        }
    }

    public static void cadastrarFuncionario(Biblioteca biblioteca, int entrada) {
        System.out.printf("Cadastrar Funcionário\n");
        String nome, email, senha, telefone, cpf;
        double salario;
        System.out.printf("Nome: ");
        limparBuffer();
        nome = LER.nextLine();
        System.out.printf("Email: ");
        email = LER.nextLine();
        System.out.printf("Senha: ");
        senha = LER.nextLine();
        System.out.printf("Telefone: ");
        telefone = LER.nextLine();
        System.out.printf("CPF: ");
        cpf = LER.nextLine();
        System.out.println("Salário: ");
        salario = LER.nextDouble();
        System.out.println("Turno:\n1 - Manhã\n2 - Tarde\n3 - Noite");
        entrada = lerRestritoD();
        if (entrada == 1) {
            biblioteca.addFuncionario(
                    new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.MANHA, salario));
        } else if (entrada == 2) {
            biblioteca.addFuncionario(
                    new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.TARDE, salario));
        } else {
            biblioteca.addFuncionario(
                    new Funcionario(nome, email, senha, telefone, cpf, Funcionario.Turnos.NOITE, salario));
        }
        limparTela();
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public static void removerFuncionario(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getFuncionarios().isEmpty()) {
            System.out.println("Não há funcionários cadastrados na biblioteca!");
            return;
        } else {
            System.out.printf("Remover Funcionário\n");
            for (int i = 0; i < biblioteca.getFuncionarios().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getFuncionarios().get(i).getNome() + "\n");
            }
            System.out.println("Escolha o funcionário que deseja remover:");
            entrada = lerRestritoE(biblioteca);
            biblioteca.removeFuncionario(biblioteca.getFuncionarios().get(entrada - 1));
            limparTela();
            System.out.println("Funcionário removido com sucesso!");
        }
    }

    public static void cadastrarCliente(Biblioteca biblioteca) {
        System.out.printf("Cadastrar Cliente\n");
        String nome, email, senha, telefone, cpf;
        System.out.printf("Nome: ");
        limparBuffer();
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
        limparTela();
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void removerCliente(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getClientes().size() == 0) {
            System.out.println("Não há clientes cadastrados na biblioteca!");
            return;
        } else {
            System.out.printf("Remover Cliente\n");
            for (int i = 0; i < biblioteca.getClientes().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
            }
            System.out.println("Escolha o cliente que deseja remover:");
            entrada = lerRestritoF(biblioteca);
            limparTela();
            biblioteca.removeCliente(biblioteca.getClientes().get(entrada - 1));
            System.out.println("Cliente removido com sucesso!");
        }
    }

    public static void editarCliente(Biblioteca biblioteca, int entrada) {
        System.out.println("Editar Cliente");
        if (biblioteca.getClientes().isEmpty()) {
            System.out.println("Não há clientes cadastrados na biblioteca!");
            return;
        }
        System.out.printf("Alterar Dados do Cliente\n");
        for (int i = 0; i < biblioteca.getClientes().size(); i++) {
            System.out.printf((i + 1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
        }
        System.out.println("Escolha o cliente que deseja alterar os dados:");
        entrada = lerRestritoF(biblioteca);
        limparTela();
        Cliente cliente = biblioteca.getClientes().get(entrada - 1);
        System.out.println("Novo nome (atual: " + cliente.getNome() + "): ");
        limparBuffer();
        String nome = LER.nextLine();
        System.out.println("Novo email (atual: " + cliente.getEmail() + "): ");
        String email = LER.nextLine();
        System.out.println("Nova senha (atual: " + cliente.getSenha() + "): ");
        String senha = LER.nextLine();
        System.out.println("Novo telefone (atual: " + cliente.getTelefone() + "): ");
        String telefone = LER.nextLine();
        System.out.println("Novo CPF (atual: " + cliente.getCpf() + "): ");
        String cpf = LER.nextLine();
        limparTela();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setSenha(senha);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);
        System.out.println("Dados do cliente alterados com sucesso!");
    }

    public static void cadastrarLivro(Biblioteca biblioteca) {
        System.out.printf("Cadastrar Livro\n");
        String titulo, autor, editora;
        int copiasNoAcervo;
        System.out.printf("Título: ");
        limparBuffer();
        titulo = LER.nextLine();
        System.out.printf("Autor: ");
        autor = LER.nextLine();
        System.out.printf("Editora: ");
        editora = LER.nextLine();
        System.out.printf("Número de cópias no acervo: ");
        copiasNoAcervo = LER.nextInt();
        Livro livro = new Livro(titulo, new Autor(autor), new Editora(editora), copiasNoAcervo);
        biblioteca.addLivro(livro);
        limparTela();
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void removerLivro(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getLivros().isEmpty()) {
            System.out.println("Não há livros cadastrados na biblioteca!");
            return;
        } else {
            System.out.printf("Remover Livro\n");
            for (int i = 0; i < biblioteca.getLivros().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getLivros().get(i).getNome() + "\n");
            }
            System.out.println("Escolha o livro que deseja remover:");
            entrada = lerRestritoG(biblioteca);
            biblioteca.removeLivro(biblioteca.getLivros().get(entrada - 1));
            limparTela();
            System.out.println("Livro removido com sucesso!");
        }
    }

    public static void editarLivro(Biblioteca biblioteca, int entrada) {
        System.out.println("Editar Livro");
        if (biblioteca.getLivros().isEmpty()) {
            System.out.println("Não há livros cadastrados na biblioteca!");
            return;
        }
        System.out.printf("Alterar Dados do Livro\n");
        for (int i = 0; i < biblioteca.getLivros().size(); i++) {
            System.out.printf((i + 1) + " - " + biblioteca.getLivros().get(i).getNome() + "\n");
        }
        System.out.println("Escolha o livro que deseja alterar os dados:");
        entrada = lerRestritoG(biblioteca);
        Livro livro = biblioteca.getLivros().get(entrada - 1);
        System.out.println("Novo título (atual: " + livro.getNome() + "): ");
        limparBuffer();
        String titulo = LER.nextLine();
        System.out.println("Novo autor (atual: " + livro.getAutor().getNome() + "): ");
        String autor = LER.nextLine();
        System.out.println("Nova editora (atual: " + livro.getEditora().getNome() + "): ");
        String editora = LER.nextLine();
        System.out.println("Novo número de cópias no acervo (atual: " + livro.getCopiasNoAcervo() + "): ");
        int copiasNoAcervo = LER.nextInt();
        limparTela();
        livro.setNome(titulo);
        livro.setAutor(new Autor(autor));
        livro.setEditora(new Editora(editora));
        livro.setCopiasNoAcervo(copiasNoAcervo);
        System.out.println("Dados do livro alterados com sucesso!");
    }

    public static void registrarEmprestimo(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getClientes().isEmpty()) {
            System.out.println("Não há clientes cadastrados na biblioteca!");
            return;
        } else if (biblioteca.getLivros().isEmpty()) {
            System.out.println("Não há livros cadastrados na biblioteca!");
            return;
        } else {
            System.out.printf("Registrar Empréstimo\n");
            System.out.println("Escolha o cliente que fará o empréstimo:");
            for (int i = 0; i < biblioteca.getClientes().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
            }
            entrada = lerRestritoG(biblioteca);
            limparTela();
            Cliente cliente = biblioteca.getClientes().get(entrada - 1);
            Emprestimo emprestimo = new Emprestimo(cliente, LocalDate.now(), LocalDate.now().plusDays(7));
            while (true) {
                System.out.println("Escolha o livro que deseja emprestar (ou 0 para finalizar):");
                for (int i = 0; i < biblioteca.getLivros().size(); i++) {
                    System.out.printf((i + 1) + " - " + biblioteca.getLivros().get(i).getNome()
                            + " (Cópias disponíveis: " + biblioteca.getLivros().get(i).getCopiasNoAcervo() + ")\n");
                }
                entrada = lerRestritoG(biblioteca);
                limparTela();
                if (entrada == 0) {
                    break;
                }
                Livro livro = biblioteca.getLivros().get(entrada - 1);
                if (livro.getCopiasNoAcervo() > 0) {
                    emprestimo.addLivro(livro);
                    cliente.addLivroEmPosse(livro);
                    System.out.println("Livro adicionado ao empréstimo!");
                } else {
                    System.out.println("Não há cópias disponíveis desse livro!");
                }
            }
            if (emprestimo.getLivrosEmprestados().isEmpty()) {
                System.out.println("Nenhum livro foi adicionado ao empréstimo. Operação cancelada.");
            } else {
                biblioteca.addEmprestimo(emprestimo);
                cliente.addEmprestimo(emprestimo);
                System.out.println("Empréstimo registrado com sucesso!");
            }
        }
    }

    public static void registrarDevolucao(Biblioteca biblioteca, int entrada) {
        if (biblioteca.getClientes().isEmpty()) {
            System.out.println("Não há clientes cadastrados na biblioteca!");
            return;
        } else if (biblioteca.getLivros().isEmpty()) {
            System.out.println("Não há livros cadastrados na biblioteca!");
            return;
        } else if (biblioteca.getEmprestimos().isEmpty()) {
            System.out.println("Não há empréstimos registrados na biblioteca!");
            return;
        } else {
            System.out.printf("Registrar Devolução\n");
            System.out.println("Escolha o cliente que fará a devolução:");
            for (int i = 0; i < biblioteca.getClientes().size(); i++) {
                System.out.printf((i + 1) + " - " + biblioteca.getClientes().get(i).getNome() + "\n");
            }
            entrada = lerRestritoG(biblioteca);
            limparTela();
            Cliente cliente = biblioteca.getClientes().get(entrada - 1);
            if (cliente.getLivrosEmPosse().isEmpty()) {
                System.out.println("Esse cliente não possui livros em posse!");
                return;
            } else {
                System.out.println("Escolha o empréstimo que deseja devolver:");
                for (int i = 0; i < cliente.getEmprestimosFeitos().size(); i++) {
                    Emprestimo emp = cliente.getEmprestimosFeitos().get(i);
                    System.out.printf((i + 1) + " - Empréstimo de " + emp.getDataEmprestimo() + " com "
                            + emp.getLivrosEmprestados().size() + " livros. Status: " + emp.getEstadoEmprestimo()
                            + "\n");
                    System.out.println("  Livros:");
                    for (Livro l : emp.getLivrosEmprestados()) {
                        System.out.printf("   - " + l.getNome() + "\n");
                    }
                }
                entrada = lerRestritoH(cliente);
                limparTela();
                Emprestimo emprestimoParaDevolver = cliente.getEmprestimosFeitos().get(entrada - 1);
                if (emprestimoParaDevolver.getEstadoEmprestimo() == Emprestimo.Status.DEVOLVIDO) {
                    System.out.println("Esse empréstimo já foi devolvido!");
                    return;
                } else {
                    Emprestimo.devolverEmprestimo(emprestimoParaDevolver);
                    System.out.println("Empréstimo devolvido com sucesso!");
                }

            }
        }
    }

    public static void verLivrosDisponiveis(Biblioteca biblioteca) {
        if (biblioteca.getLivros().isEmpty()) {
            System.out.println("Não há livros cadastrados na biblioteca!");
            return;
        } else {
            System.out.printf("Livros Disponíveis\n");
            for (int i = 0; i < biblioteca.getLivros().size(); i++) {
                Livro livro = biblioteca.getLivros().get(i);
                System.out.printf((i + 1) + " - " + livro.getNome() + " (Cópias disponíveis: "
                        + livro.getCopiasNoAcervo() + ")\n");
            }
        }
    }

    public static void verEmprestimos(Biblioteca biblioteca, int indexLogin) {
        System.out.printf("Ver Meus Empréstimos\n");
        Cliente cliente = biblioteca.getClientes().get(indexLogin - 1);
        if (cliente.getEmprestimosFeitos().isEmpty()) {
            System.out.println("Você não possui empréstimos!");
            return;
        } else {
            System.out.printf("Empréstimos de " + cliente.getNome() + "\n");
            for (Emprestimo emp : cliente.getEmprestimosFeitos()) {
                System.out.printf(
                        "Empréstimo de " + emp.getDataEmprestimo() + " com " + emp.getLivrosEmprestados().size()
                                + " livros. Status: " + emp.getEstadoEmprestimo() + "\n");
                System.out.println("  Livros:");
                for (Livro l : emp.getLivrosEmprestados()) {
                    System.out.printf("   - " + l.getNome() + "\n");
                }
            }
        }
    }

    public static void verLivrosEmPosse(Biblioteca biblioteca, int indexLogin) {
        if (biblioteca.getClientes().get(indexLogin - 1).getLivrosEmPosse().isEmpty()) {
            System.out.println("Você não tem nenhum livro em posse!");
        } else {
            System.out.println("Livros em posse:");
            for (Livro livro : biblioteca.getClientes().get(indexLogin - 1).getLivrosEmPosse()) {
                System.out.printf("Livro: %s\nAutor: %s\nEditora: %s\n", livro.getNome(), livro.getAutor(),
                        livro.getEditora());
            }
        }
    }

    public static void imprimirCabecalho() {
        System.out.printf("=================Bem-vindo à Biblioteca System!=================\n\n");
        System.out.printf("O que deseja fazer?\n");
        System.out.printf("1 - Acessar como Gerente\n");
        System.out.printf("2 - Acessar como Funcionário\n");
        System.out.printf("3 - Acessar como Cliente\n");
        System.out.println("4 - Sair");
    }

    public static int lerRestritoA() {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada < 5) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoA();
        }
    }

    public static int lerRestritoB() {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada < 7) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoB();
        }
    }

    public static int lerRestritoC(Biblioteca biblioteca) {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada <= biblioteca.getGerentes().size()) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoC(biblioteca);
        }
    }

    public static int lerRestritoD() {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada < 4) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoD();
        }
    }

    public static int lerRestritoE(Biblioteca biblioteca) {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada <= biblioteca.getFuncionarios().size()) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoE(biblioteca);
        }
    }

    public static int lerRestritoF(Biblioteca biblioteca) {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada <= biblioteca.getClientes().size()) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoF(biblioteca);
        }
    }

    public static int lerRestritoG(Biblioteca biblioteca) {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada <= biblioteca.getLivros().size()) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoG(biblioteca);
        }
    }

    public static int lerRestritoH(Cliente cliente) {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada <= cliente.getEmprestimosFeitos().size()) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoH(cliente);
        }
    }

    public static int lerRestritoI() {
        int entrada = LER.nextInt();
        if (entrada > 0 && entrada < 6) {
            return entrada;
        } else {
            System.out.println("Entrada inválida! Tente novamente:");
            return lerRestritoI();
        }
    }

    public static void limparBuffer() {
        LER.nextLine();
    }

    public static void limparTela() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");
    }

}