/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import model.Produto;
import repositorios.RepositorioProdutos;
import util.Console;
import view.menu.ProdutoMenu;

/**
 *
 * @author lhries
 */
public class ProdutoUI {
    private RepositorioProdutos listaProdutos;

    public ProdutoUI(RepositorioProdutos lista) {
        this.listaProdutos = lista;
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(ProdutoMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case ProdutoMenu.OpcaoCadastrar:
                    cadastrarProdutos();
                    break;
                case ProdutoMenu.OpcaoListar:
                    mostrarProdutos();
                    break;
                case ProdutoMenu.OpcaoVoltar:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != ProdutoMenu.OpcaoVoltar);
    }

    private void cadastrarProdutos() {
        String nome = Console.scanString("Nome: ");
        if (listaProdutos.buscarProdutoPorNome(nome)!= null) {
            System.out.println("Produto já cadastrado");
        } else {            
            int codProduto = Console.scanInt("Código do Produto: ");
            double precoUnid = Console.scanDouble("Preço por Unidade: ");            
            listaProdutos.adicionaProduto(new Produto(nome, codProduto, precoUnid ));
            System.out.println("Produto "+nome+" cadastrado com sucesso.");
        }
    }

    public void mostrarProdutos() {
        System.out.println(".........................................\n");
        System.out.println(String.format("%-10s", "Código") + "\t"
                + String.format("%-30s", "|Nome") + "\t"
                + String.format("%-10s", "|Preço Unitário"));
        for (Produto produto : listaProdutos.getListaProdutos()) {
            System.out.println(String.format("%-10s", produto.getCodProduto()) + "\t"
                    + String.format("%-30s", "|" + produto.getNomeProduto()) + "\t"
                    + String.format("%-10s", "|" + produto.getPrecoProduto()));
        }

    }    
}
