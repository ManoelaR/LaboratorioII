package model;

public class Produto {
    
    private String nomeProduto;
    private int codProduto;
    private double precoProduto;
    
    public Produto(String nomeProduto, int codProduto, double precoProduto){
        this.nomeProduto=nomeProduto;
        this.codProduto=codProduto;
        this.precoProduto=precoProduto;
    }
    
    public String getNomeProduto(){
        return nomeProduto;
    }
    
    public int getCodProduto(){
        return codProduto;
    }
    
    public double getPrecoProduto(){
        return precoProduto;
    }    
}

  
    

