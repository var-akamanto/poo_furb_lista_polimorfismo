package models;

import models.abstracts.Figura;

public class Retangulo extends Figura{
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.base * this.altura;
    }
    
}
