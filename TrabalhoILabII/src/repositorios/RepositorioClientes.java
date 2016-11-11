/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import model.Venda;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author manul
 */
public class RepositorioClientes {
    
    private List<Cliente> clientes;
    private List<Venda> listaVendas;
    
    public RepositorioClientes(){
        clientes = new ArrayList<Cliente>();        
    }
    
    public boolean adicionaCliente(Cliente cliente){
        return (clientes.add(cliente));
    }
    
    public List<Cliente> getListaClientes(){
        return clientes;
    }
    
    public boolean clienteJaCadastrado(String cpf){
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equals(cpf)){
                return true;             
            }
        }
        return false;      
    }
    
    public Cliente buscaCliente(String cpf) {
        for (Cliente cliente: clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
           }
        }
        return null;
    }
}    
    

    
    
