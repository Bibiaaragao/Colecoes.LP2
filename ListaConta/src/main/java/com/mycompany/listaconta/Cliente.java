package com.mycompany.listaconta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Cliente {
    private List<Conta> contas;
    
    public Cliente(){
        contas = new ArrayList();
    }
    
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    
    public void ordenarNumero(){
        Collections.sort(contas);
        System.out.println("Ordenadas pelo número: ");
        for(Conta conta : contas){
            System.out.println(conta);
        }
        
    }
    
    public void ordenarTitular(){
        contas.sort(Comparator.comparing(Conta::getTitular));
        System.out.println("\nOrdenadas pelo nome do titular: ");
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
}
