package view;

import model.Venda;
import repositorios.RepositorioVendas;
import repositorios.RepositorioProdutos;
import repositorios.RepositorioClientes;
import repositorios.RepositorioContas;
import util.Console;
import view.menu.MainMenu;

/**
 *
 * @author lhries
 */
public class MainUI {
    private RepositorioClientes listaClientes;
    private RepositorioProdutos listaProdutos;
    private RepositorioVendas listaVendas;
    private RepositorioContas listaContas;
    private Venda venda;

    public MainUI() {
        listaClientes = new RepositorioClientes();
        listaProdutos = new RepositorioProdutos();
        listaVendas = new RepositorioVendas();
        venda = new Venda();
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case MainMenu.OpcaoClientes:
                    new ClienteUI(listaClientes).executar();
                    break;
                case MainMenu.OpcaoProdutos:
                    new ProdutoUI(listaProdutos).executar();
                    break;
                case MainMenu.OpcaoConta:
                    new ContaUI(listaClientes,listaProdutos,listaVendas).executar();
                    break;
                case MainMenu.OpcaoVenda:
                    new PedidoUI(listaProdutos, venda).executar();
                    break;
                case MainMenu.OpcaoRelatorio:
                    new RelatorioUI(listaVendas).executar();
                    break;
                case MainMenu.OpcaoSair:
                    System.out.println("Finalizando Aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != MainMenu.OpcaoSair);
    }

}
