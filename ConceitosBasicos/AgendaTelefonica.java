package ConceitosBasicos;

import java.util.Scanner;

// Exceção personalizada para contato não encontrado
class ContatoNaoEncontradoException extends Exception {
    public ContatoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

// Exceção personalizada para agenda cheia
class AgendaCheiaException extends Exception {
    public AgendaCheiaException(String mensagem) {
        super(mensagem);
    }
}

// Classe Contato, contendo nome e telefone
class Contato {
    private String nome;
    private String telefone;

    // Construtor da classe Contato
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters para acessar os dados do contato
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // Método para exibir as informações do contato
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

// Classe Agenda, que armazena os contatos e tem métodos para manipular a agenda
class Agenda {
    private Contato[] contatos;
    private int contador;

    // Construtor da agenda, que inicializa o array de contatos com capacidade para 100 contatos
    public Agenda() {
        contatos = new Contato[100];
        contador = 0;
    }

    // Método para adicionar um novo contato
    public void adicionarContato(String nome, String telefone) throws AgendaCheiaException {
        if (contador >= 100) {
            throw new AgendaCheiaException("A agenda está cheia! Não é possível adicionar mais contatos.");
        }
        contatos[contador] = new Contato(nome, telefone);
        contador++;
        System.out.println("Contato adicionado com sucesso!");
    }

    // Método para remover um contato pelo nome
    public void removerContato(String nome) throws ContatoNaoEncontradoException {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                // Remove o contato, reorganizando o array
                for (int j = i; j < contador - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[contador - 1] = null; // Libera o último espaço
                contador--;
                System.out.println("Contato " + nome + " removido com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            throw new ContatoNaoEncontradoException("Contato " + nome + " não encontrado.");
        }
    }

    // Método para buscar um contato pelo nome
    public Contato buscarContato(String nome) throws ContatoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i];
            }
        }
        throw new ContatoNaoEncontradoException("Contato " + nome + " não encontrado.");
    }

    // Método para listar todos os contatos
    public void listarContatos() {
        if (contador == 0) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i]);
            }
        }
    }
}

// Classe principal para interagir com o usuário
public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            // Exibição do menu de opções
            System.out.println("\n--- Agenda Telefônica ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Listar Todos os Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = Integer.parseInt(scanner.nextLine());

            try {
                switch (opcao) {
                    case 1:
                        // Adicionar novo contato
                        System.out.print("Digite o nome do contato: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o telefone do contato: ");
                        String telefone = scanner.nextLine();
                        agenda.adicionarContato(nome, telefone);
                        break;

                    case 2:
                        // Remover contato pelo nome
                        System.out.print("Digite o nome do contato a ser removido: ");
                        String nomeRemover = scanner.nextLine();
                        agenda.removerContato(nomeRemover);
                        break;

                    case 3:
                        // Buscar contato pelo nome
                        System.out.print("Digite o nome do contato a ser buscado: ");
                        String nomeBuscar = scanner.nextLine();
                        Contato contato = agenda.buscarContato(nomeBuscar);
                        System.out.println("Contato encontrado: " + contato);
                        break;

                    case 4:
                        // Listar todos os contatos
                        agenda.listarContatos();
                        break;

                    case 0:
                        // Sair do programa
                        System.out.println("Saindo da agenda...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (AgendaCheiaException | ContatoNaoEncontradoException e) {
                // Captura e exibe as exceções personalizadas
                System.out.println(e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}
