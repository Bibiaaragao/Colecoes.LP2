package com.mycompany.listaconta;
import java.util.Collections;
import java.util.Comparator;

public class Conta implements Comparable<Conta>{
    private int numero;
    private String titular;
    private double saldo, limiteCredito;
    
    public Conta(int numero, String titular, double saldo, double limiteCredito){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public double getLimiteCredito(){
        return limiteCredito;
    }
    
    public int compareTo(Conta c){
        return Integer.compare(this.numero, c.numero);
    }
    
    
    public void imprimirDados(){
        System.out.println("--Conta--" + "\nNúmero: " + numero + "\nTitular: " 
                + titular + "\nSaldo: " + saldo + "\nLimite do cartão de crédito: " + limiteCredito);
    }
    
    public String toString(){
        return "\n--Conta--" + "\nNúmero: " + numero + "\nTitular: " 
                + titular + "\nSaldo: " + saldo + "\nLimite do cartão de crédito: " + limiteCredito;
    }
    
        
}
