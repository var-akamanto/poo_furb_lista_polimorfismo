package models;

import models.abstracts.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{
    @Override 
    public void sacar(double valor){
        System.out.println("saque de " + valor + " na conta poupança");
    }    
}
