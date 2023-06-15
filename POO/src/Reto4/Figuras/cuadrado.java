package Reto4.Figuras;

import java.util.Scanner;
// Indicamos con la palabra reservada extends que la clase Cuadrado pertenece a la super clase Figura

public class cuadrado extends Figura{
     // Declaramos los atributos
    private int lado;
// Creamos el método constructor sin parámetros
    public cuadrado() {
    }
  // Creamos el método constructor con parámetros
    public cuadrado(int lado) {
        this.lado = lado;
    }
    // Creamos los get and Set

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
     // Este método servirá para solicitar los datos que serán necesarios para calcular el area de la figura

    public void pedirLado() {
         // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos y capturamos los datos necesarios
        System.out.println("Ingrese el valor de los lados del cuadrado:");
        lado = entrada.nextInt();
        
    }
// Este método servirá para calcular el area del Cuadrado
    public void calcularArea() {
        // Declaramos las variables
        float area;
        // Calculamos el area
        area = lado*lado;
         // Mostramos resultados
        System.out.println("El lado del cuadrado es "+lado+" el área es: "+area);
    }
        // Este método sirve para identificar el método abstracto de la super clase y no se muestre un error

    public void calcularPer() {
        
    }
    
}
