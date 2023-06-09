package Reto4.Figuras;

import java.util.Scanner;

public class Triangulo extends Figura{
    private float base;
    private float altura;
    public Triangulo() {
    }
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void pedirDatosT() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la base de su triangulo: ");
        base = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su triangulo: ");
        altura = entrada.nextFloat();
    }

    public void calcularArea() {
        float area = 0;
        area = (base*altura)/2;
        System.out.println("Su triangulo con una base de "+base+" y una altura de "+altura+" tiene una area de:: "+area);
    }
    public void calcularPer() {
        
    }

    
    
}
