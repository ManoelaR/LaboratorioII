package model;

public class Conta {
    
    private int numConta;
    private double saldoConta;
    
    public Conta(int numConta, double saldoConta){
        this.numConta=numConta;
        this.saldoConta=saldoConta;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public double getSaldoConta(){
        return saldoConta;
    }
    
    
    
}
