package view;

import java.text.ParseException;
import model.Cliente;
import repositorios.RepositorioClientes;
import util.Console;
import util.DateUtil;
import view.menu.ClienteMenu;

public class ClienteUI {

    private RepositorioClientes lista;

    public ClienteUI(RepositorioClientes lista) {
        this.lista = lista;
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(ClienteMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case ClienteMenu.OpcaoCadastro:
                    cadastrarCliente();
                    break;
                case ClienteMenu.OpcaoListar:
                    mostrarClientes();
                    break;
                case ClienteMenu.OpcaoVoltar:
                    System.out.println("Você será redirecionado ao Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != ClienteMenu.OpcaoVoltar);
    }

    private void cadastrarCliente() {
        String cpf = Console.scanString("CPF: ");
        if (lista.clienteJaCadastrado(cpf)) {
            System.out.println("Já há um Cadastro relacionado a este CPF.");
        } else {
            String nome = Console.scanString("Nome: ");
            String email = Console.scanString("Email: ");
            
            lista.adicionaCliente(new Cliente(nome, cpf, email));
            System.out.println("Cliente "+nome+" cadastrado com sucesso.");
        }
    }

        public void mostrarClientes() {
            System.out.println(".........................................\n");
            System.out.println(String.format("%-15s", "CPF") + "\t"
                + String.format("%-30s", "|Nome") + "\t"
                + String.format("%-50s", "|Email"));
        for (Cliente cliente : lista.getListaClientes()) {
            System.out.println(String.format("%-15s", cliente.getCpf()) + "\t"
                    + String.format("%-30s", "|" + cliente.getNome()) + "\t"
                    + String.format("%-50s", "|" + cliente.getEmail()));
        }

    }
}
