package Reto4.Figuras;

import java.util.Scanner;
// Indicamos con la palabra reservada extends que la clase Rectangulo pertenece a la super clase Figura

public class Rectangulo extends Figura{
    // Declaramos los atributos
    private Float base;
    private float altura;
    // Creamos el método constructor sin parámetros
    public Rectangulo() {
    }
    // Creamos el método constructor con parámetros
    public Rectangulo(Float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    // Creamos los get and Set
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
     // Este método servirá para solicitar los datos que serán necesarios para calcular el area de la figura
    public void pedirDatosR() {
         // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos y capturamos los datos necesarios
        System.out.println("Por favor ingrese la base de su rectangulo: ");
        base = entrada.nextFloat();
        System.out.println("Por favor ingrese la altura de su rectangulo: ");
        altura = entrada.nextFloat();

    }

// Este método servirá para calcular el area del Rectangulo
    public void calcularArea(){
        // Declaramos las variables
        float area = 0;
        // Calculamos el area
        area = base*altura;
        // Mostramos resultados
        System.out.println("Su rectangulo con una base de "+base+" y una altura de "+altura+" tiene una area de:: "+area);
    }
    // Este método sirve para identificar el método abstracto de la super clase y no se muestre un error
    public void calcularPer(){

    }
    
}
