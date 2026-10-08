package models;

public class Gerente extends Funcionario{
    public boolean metaAtingida;
    public double percentualBonus;

    public Gerente(String nome, double salarioBase, boolean metaAtingida, double percentualBonus) {
        super(nome, salarioBase);
        this.metaAtingida = metaAtingida;
        this.percentualBonus = percentualBonus;
    }

    public double calcularSalario(){
        if(metaAtingida){
            return ((this.salarioBase) + (this.percentualBonus * this.salarioBase));
        }
        else{
            return this.salarioBase;
        }
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", metaAtingida=" + metaAtingida + ", salarioBase=" + salarioBase
                + ", percentualBonus=" + percentualBonus + ", calcularSalario()=" + calcularSalario() + "]";
    }

    
}
