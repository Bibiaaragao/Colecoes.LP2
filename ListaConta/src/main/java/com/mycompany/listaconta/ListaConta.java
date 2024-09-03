package com.mycompany.listaconta;

public class ListaConta {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta c1 = new Conta(124343, "Camila Barros", 348.6, 700.0);
        Conta c2 = new Conta(765348, "Bruno Machado", 214.1, 950.0);
        Conta c3 = new Conta(586326, "Vivian Souza", 2672.2, 3200.0);
        
        cliente.adicionarConta(c1);
        cliente.adicionarConta(c2);
        cliente.adicionarConta(c3);
        
        cliente.ordenarNumero();
        cliente.ordenarTitular();
    }
}
