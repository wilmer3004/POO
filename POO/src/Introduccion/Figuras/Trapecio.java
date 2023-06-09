package Introduccion.Figuras;

import java.util.Scanner;

public class Trapecio extends Figura {
    private float ladoA;
    private float ladoB;
    private float altura;
    public Trapecio() {
    }
    public Trapecio(float ladoA, float ladoB, float altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }
    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void pedirDatosTrapecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el lado paralelo A de su trapecio: ");
        ladoA = entrada.nextFloat();
        System.out.println("Por favor ingrese el lado paralelo B de su trapecio: ");
        ladoB = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su trapecio: ");
        altura = entrada.nextFloat();
    }

    public void calcularArea() {
        float area = 0;
        area = ((ladoA+ladoB)*altura)/2;
        System.out.println("Su trapecio con un lado paralelo A de "+ladoA+ ", un lado paralelo B de "+ladoB+" y una altura de "+altura+" tiene una area de:: "+area);
    }

    public void calcularPer() {
        
    }
    
    
    
}
