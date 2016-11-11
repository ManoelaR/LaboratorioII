package model;


import java.util.ArrayList;
import model.Pedido;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Produto;


public class Venda {
    
    private static int codVendaGerado = 1;
    private int codigo;
    private Date horario;
    private Cliente cliente;   
    private List<Pedido> pedido;
    private boolean finalizado;
    
    public Venda(Cliente c, String pedido){
        this.codigo = gerarCodigo();
        this.horario = new Date();
        this.cliente = c;        
        this.pedido = new ArrayList<>();
        this.finalizado = false;           
    }
    
    
    public Venda(Date h, Cliente c, String ped ){        
        this.codigo = gerarCodigo();
        this.cliente = c;        
        this.pedido = new ArrayList<>();
        this.finalizado = false;        
    }

    public Venda() {        
    }
    
    public int getcodVendaGerado() {
        return codVendaGerado;
    }    
    
    public Date getHorario() {
        return horario;
    }

    public Cliente getCliente() {
        return cliente;
    }    
    
    public List<Pedido> getPedido(){
        return pedido;
    }    

    public void adicionarItemAoPedido(Pedido i) {
        pedido.add(i);
    }

    public Pedido removeItemDoPedido(int posicao) {
        return (pedido.remove(posicao));
    }
    
   public boolean temItensNoPedido(Produto pr){
        for(Pedido item: pedido)
        {
            if(item.getProduto().getCodProduto() == pr.getCodProduto())
                return true;
        }
        return false;
    } 

    public int quantidadeItens() {
        return (pedido.size());
    }

    public boolean estaFinalizado() {
        return finalizado;
    }

    public void finalizar() {
        finalizado = true;
    }

    private int gerarCodigo() {
        return (codVendaGerado++);
    }

   

}