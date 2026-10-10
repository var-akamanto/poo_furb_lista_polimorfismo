package models;

import models.abstracts.Figura;

public class Circulo extends Figura{
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override 
    public double calcularArea(){
        return java.lang.Math.PI * java.lang.Math.pow(raio, 2);
    }    
}
