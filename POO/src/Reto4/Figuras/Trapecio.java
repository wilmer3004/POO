package Reto4.Figuras;

import java.util.Scanner;
// Indicamos con la palabra reservada extends que la clase Trapecio pertenece a la super clase Figura

public class Trapecio extends Figura {
    // Declaramos los atributos
    private float ladoA;
    private float ladoB;
    private float altura;
    // Creamos el método constructor sin parámetros
    public Trapecio() {
    }
    // Creamos el método constructor con parámetros
    public Trapecio(float ladoA, float ladoB, float altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }
    // Creamos los get and Set
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
     // Este método servirá para solicitar los datos que serán necesarios para calcular el area de la figura

    public void pedirDatosTrapecio() {
         // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos y capturamos los datos necesarios
        System.out.println("Por favor ingrese el lado paralelo A de su trapecio: ");
        ladoA = entrada.nextFloat();
        System.out.println("Por favor ingrese el lado paralelo B de su trapecio: ");
        ladoB = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su trapecio: ");
        altura = entrada.nextFloat();
    }
// Este método servirá para calcular el area del Trapecio

    public void calcularArea() {
         // Declaramos las variables
        float area = 0;
        // Calculamos el area
        area = ((ladoA+ladoB)*altura)/2;
        // Mostramos resultados
        System.out.println("Su trapecio con un lado paralelo A de "+ladoA+ ", un lado paralelo B de "+ladoB+" y una altura de "+altura+" tiene una area de:: "+area);
    }
    // Este método sirve para identificar el método abstracto de la super clase y no se muestre un error

    public void calcularPer() {
        
    }
    
    
    
}
