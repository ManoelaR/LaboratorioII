
package view;

import model.Conta;
import repositorios.RepositorioClientes;
import repositorios.RepositorioContas;
import repositorios.RepositorioProdutos;
import repositorios.RepositorioVendas;
import util.Console;
import view.menu.ContaMenu;

public class ContaUI {
    
    private RepositorioContas listaContas;
    
    public ContaUI (RepositorioContas lista){
        this.listaContas=lista;
    }
    
    public void executar(){
        int opcao = 0;
        do{
            System.out.println(ContaMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção: ");
            switch(opcao){
                case ContaMenu.OpcaoSaldo:
                    consultarSaldo();
                    break;
                case ContaMenu.OpcaoDeposito:    
                    realizarDeposito();
                    break;
                case ContaMenu.OpcaoTransferencia:    
                    realizarTranferencia();
                    break;
                case ContaMenu.OpcaoVoltar:    
                    System.out.println("Retornando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Opção Inválida.");                    
            }
        } while (opcao != ContaMenu.OpcaoVoltar);
    }    

    public void consultarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void realizarDeposito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void realizarTranferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}

