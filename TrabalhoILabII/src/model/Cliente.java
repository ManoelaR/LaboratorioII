package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 631420043
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    
    
    public Cliente(String nome, String cpf, String email){
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
    } 
    
   public String getNome(){
      return nome; 
   }
   
   public String getCpf(){
       return cpf;
   }
   
   public String getEmail(){
       return email;
   }
   
   public String toString(){
       return "Nome: "+nome+"\nCPF: "+cpf+"\nEmail: "+email;
   }
    
}
