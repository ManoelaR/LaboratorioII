/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class RepositorioProdutos {
    private List<Produto> listaProdutos;

    public RepositorioProdutos() {
        listaProdutos = new ArrayList<Produto>();
    }

    public boolean adicionaProduto(Produto produto) {
        return (listaProdutos.add(produto));
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public boolean ProdutoJaCadastrado(int codProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getCodProduto()==codProduto) {
                return true;
            }
        }
        return false;
    }

    public Produto buscarProduto(int codProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getCodProduto()==codProduto) {
                return produto;
           }
        }
        return null;
    }    
    public Produto buscarProdutoPorNome(String nomeProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(nomeProduto)) {
                return produto;
           }
        }
        return null;
    } 

}