package Introduccion.Figuras;

import java.util.Scanner;

public class Rectangulo extends Figura{
    private Float base;
    private float altura;
    public Rectangulo() {
    }
    public Rectangulo(Float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public Float getBase() {
        return base;
    }
    public void setBase(Float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void pedirDatosR() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la base de su rectangulo: ");
        base = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su rectangulo: ");
        altura = entrada.nextFloat();

    }

    public void calcularArea(){
        float area = 0;
        area = base*altura;
        System.out.println("Su rectangulo con una base de "+base+" y una altura de "+altura+" tiene una area de:: "+area);
    }
    public void calcularPer(){

    }
    
}
