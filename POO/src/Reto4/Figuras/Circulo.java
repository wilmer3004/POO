package Reto4.Figuras;

import java.util.Scanner;

public class Circulo extends Figura {
    private Double pi = 3.1416;
    private Double radio;
    public Circulo() {
    }
    public Circulo(Double pi, Double radio) {
        this.pi = pi;
        this.radio = radio;
    }
    public Double getPi() {
        return pi;
    }
    public void setPi(Double pi) {
        this.pi = pi;
    }
    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void pedirRadio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo:");
        radio = entrada.nextDouble();
        
    }


    public void calcularArea() {
        Double area = 0.0;
        area = pi * Math.pow(radio, 2);
        System.out.println("El radio del circulo que usted ingreso es "+radio+" y su área es: "+area);
    }

    public void calcularPer() {
        
    }
    
    
}
