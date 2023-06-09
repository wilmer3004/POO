package Reto4.Figuras;

import java.util.Scanner;

public class cuadrado extends Figura{
    private int lado;

    public cuadrado() {
    }

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public void pedirLado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de los lados del cuadrado:");
        lado = entrada.nextInt();
        
    }
    public void calcularArea() {
        float area;
        area = lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" el área es: "+area);
    }
    public void calcularPer() {
        
    }
    
}
