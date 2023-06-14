package Reto4.Figuras;

import java.util.Scanner;
// Indicamos con la palabra reservada extends que la clase Triangulo pertenece a la super clase Figura

public class Triangulo extends Figura{
    // Declaramos los atributos
    private float base;
    private float altura;
    // Creamos el método constructor sin parámetros
    public Triangulo() {
    }
    // Creamos el método constructor con parámetros
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    // Creamos los get and Set
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
         // Este método servirá para solicitar los datos que serán necesarios para calcular el area de la figura

    public void pedirDatosT() {
         // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos y capturamos los datos necesarios
        System.out.println("Por favor ingrese la base de su triangulo: ");
        base = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su triangulo: ");
        altura = entrada.nextFloat();
    }
// Este método servirá para calcular el area del Triangulo
    public void calcularArea() {
        // Declaramos las variables
        float area = 0;
         // Calculamos el area
        area = (base*altura)/2;
        // Mostramos resultados
        System.out.println("Su triangulo con una base de "+base+" y una altura de "+altura+" tiene una area de:: "+area);
    }
        // Este método sirve para identificar el método abstracto de la super clase y no se muestre un error

    public void calcularPer() {
        
    }

    
    
}
