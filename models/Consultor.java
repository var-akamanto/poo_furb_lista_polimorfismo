package models;

import models.abstracts.Funcionario;

public class Consultor extends Funcionario{
    public int qtdViagens;
    public double valorExtraPorViagem;

    public Consultor(String nome, double salarioBase, int qtdViagens, double valorExtraPorViagem) {
        super(nome, salarioBase);
        this.qtdViagens = qtdViagens;
        this.valorExtraPorViagem = valorExtraPorViagem;
    }

    public double calcularSalario(){
        return this.salarioBase + (this.valorExtraPorViagem * this.qtdViagens);
    }

    @Override
    public String toString() {
        return "Consultor [nome=" + nome + ", qtdViagens=" + qtdViagens + ", salarioBase=" + salarioBase
                + ", valorExtraPorViagem=" + valorExtraPorViagem + ", calcularSalario()=" + calcularSalario() + "]";
    }

    
}
