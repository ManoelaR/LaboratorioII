/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Venda;
import model.Produto;
import model.Pedido;
import repositorios.RepositorioClientes;
import repositorios.RepositorioProdutos;
import util.Console;
import view.menu.PedidoMenu;


public class PedidoUI {

    private Venda venda;
    private RepositorioProdutos listaProdutos;
    
     public PedidoUI(RepositorioProdutos listaProdutos, Venda venda) {
        this.listaProdutos = listaProdutos;
        this.venda = venda;
    }

    public void executar() {
        System.out.println("Produtos: ");
        int opcao = 0;
        do {
            System.out.println(PedidoMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case PedidoMenu.OpcaoAdicionar:
                    adicionarItemAoPedido();
                    break;

                case PedidoMenu.OpcaoListar:
                    mostrarItens();
                    break;

                case PedidoMenu.OpcaoFinalizar:
                    System.out.println("Finalizando pedido com os itens selecionados...");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != PedidoMenu.OpcaoFinalizar);
    }
    
    private void adicionarItemAoPedido() {
        System.out.println("Relacione o produto abaixo para a consulta: ");
        new ProdutoUI(listaProdutos).mostrarProdutos();
        int codigo = Console.scanInt("Escolha o código do produto: ");
        Produto produto = listaProdutos.buscarProduto(codigo);
        if(produto == null || venda.temItensNoPedido(produto))
        {
            System.out.println("Produto inválido. Repita a operação.");            
        }
        else
        {
            int quantidade = Console.scanInt("Quantidade: ");
            double precoTotal = (produto.getPrecoProduto() * quantidade);
            venda.adicionarItemAoPedido(new Pedido(produto, quantidade, produto.getPrecoProduto(), precoTotal));
        }
    }    


    public void mostrarItens() {
        int index = 1;
        System.out.println(String.format("%-6s", "Índice") + "\t"
                + String.format("%-20s", "|Produto") + "\t"
                + String.format("%-10s", "|Quantidade") + "\t"
                + String.format("%-10s", "|Preço Unitário") + "\t"
                + String.format("%-10s", "|Preço Total") + "\t");
        for (Pedido pedido : venda.getPedido()) {
            System.out.println(String.format("%-6s", (index++) + "\t"
                    + String.format("%-20s", "|" + pedido.getProduto().getNomeProduto()
                            +"("+pedido.getProduto().getCodProduto()+")") + "\t"
                    + String.format("%-10s", "|" + pedido.getQuantidade())));
        }
    }

}
