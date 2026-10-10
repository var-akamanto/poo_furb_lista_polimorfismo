package models;

import models.abstracts.Funcionario;

public class Vendedor extends Funcionario {
    public double percentualComissao;
    public int ValorTotalVendas;
    
    public Vendedor(String nome, double salarioBase, double percentualComissao, int totalVendas) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
        this.ValorTotalVendas = totalVendas;
    }


    public double calcularSalario(){
        return this.salarioBase + (this.ValorTotalVendas * percentualComissao);
    }


    @Override
    public String toString() {
        return "Vendedor [nome=" + nome + ", percentualComissao=" + percentualComissao + ", salarioBase=" + salarioBase
                + ", ValorTotalVendas=" + ValorTotalVendas + ", calcularSalario()=" + calcularSalario() + "]";
    }

    
}
