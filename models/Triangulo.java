package models;

import models.abstracts.Figura;

public class Triangulo extends Figura{
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (this.base * this.altura)/2;
    }
}
