package view;

import java.util.List;
import model.Venda;
import repositorios.RepositorioVendas;
import util.Console;
import util.DateUtil;
import view.menu.RelatorioMenu;
import view.menu.ClienteMenu;

public class RelatorioUI {

    private RepositorioVendas listaVendas;

    public RelatorioUI(RepositorioVendas listaVendas) {
        this.listaVendas = listaVendas;
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(RelatorioMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case RelatorioMenu.OpcaoListarVendasFinalizadas:
                    mostrarVendasFinalizadas();
                    break;
                case RelatorioMenu.OpcaoListarVendasPorCliente:
                    mostrarVendasPorCliente();
                    break;
                case RelatorioMenu.OpcaoListasVendasPorMesEAno:
                    mostrarVendasPorMesEAno();
                    break;
                case RelatorioMenu.OpcaoVoltar:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != ClienteMenu.OpcaoVoltar);
    }

    public void mostrarVendasFinalizadas() {
        for (Venda venda : listaVendas.getListaVendasFinalizadas()) {
            imprimir(venda);
        }
    }

    private void mostrarVendasPorCliente() {
        String cpf = Console.scanString("Digite o CPF do Cliente: ");
        for (Venda venda : listaVendas.getListaVendasPorCliente(cpf)) {
            imprimir(venda);
        }
        
    }

    private void mostrarVendasPorMesEAno() {
        int mes = Console.scanInt("Mês: ");
        int ano = Console.scanInt("Ano: ");
        for (Venda venda : listaVendas.getListaVendasPorMesEAno(mes, ano)) {
            imprimir(venda);
        }
    }

    private void imprimir(Venda venda) {
        System.out.println("\nCódigo: " + venda.getcodVendaGerado());
        System.out.println("Data/Hora: " + DateUtil.dateHourToString(venda.getHorario()));
        System.out.println("Cliente: " + venda.getCliente().getNome() + "("
                + venda.getCliente().getCpf() + ")");        
        System.out.println("Pedido: ");
        new PedidoUI(null, venda).mostrarItens();
    }


}
