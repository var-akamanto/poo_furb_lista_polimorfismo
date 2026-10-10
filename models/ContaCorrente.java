package models;

import models.abstracts.ContaBancaria;

public class ContaCorrente extends ContaBancaria{
    @Override 
    public void sacar(double valor){
        System.out.println("saque de " + "reais na conta corrente" );
    }
    }
