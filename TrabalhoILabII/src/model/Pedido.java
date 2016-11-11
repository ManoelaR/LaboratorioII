
package model;

public class Pedido {
    private Produto produto;
    private int quantidade;
    private double precoUnid;
    private double precoTotal;
    
    public Pedido(Produto produto, int quantidade, double precoUnid, double precoTotal){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnid = precoUnid;
        this.precoTotal = precoTotal;
        
    }

    public Pedido(Produto produto, int quantidade, double precoProduto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnid = precoProduto;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoUnid(){
        return precoUnid;
    }      
    
    public String toString(){
        return ("Nome do Produto: "+(produto.getNomeProduto())+"\nQuantidade: "
                +quantidade+"\nPreço Unitário: "+precoUnid+"\nPreco Total: "+precoTotal);        
    }     
}
