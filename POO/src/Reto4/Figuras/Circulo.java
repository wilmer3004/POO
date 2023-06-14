package Reto4.Figuras;

import java.util.Scanner;
// Indicamos con la palabra reservada extends que la clase circulo pertenece a la super clase Figura
public class Circulo extends Figura {
    // Declaramos los atributos e inicializamos pi
    private Double pi = 3.1416;
    private Double radio;
    // Creamos el método constructor sin parámetros
    public Circulo() {
    }
    // Creamos el método constructor con parámetros
    public Circulo(Double pi, Double radio) {
        this.pi = pi;
        this.radio = radio;
    }
    // Creamos los get and Set
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
    // Este método servirá para solicitar el radio que posee el circulo
    public void pedirRadio() {
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos y capturamos el radio
        System.out.println("Ingrese el valor del radio del circulo:");
        radio = entrada.nextDouble();
        
    }

// Este método servirá para calcular el area del circulo
    public void calcularArea() {
        // Declaramos variables
        Double area = 0.0;
        // Realizamos la operacion para hallar el area del circulo 
        area = pi * Math.pow(radio, 2);
        // Mostramos resultados
        System.out.println("El radio del circulo que usted ingreso es "+radio+" y su área es: "+area);
    }
// Este método sirve para identificar el método abstracto de la super clase y no se muestre un error
    public void calcularPer() {
        
    }
    
    
}
