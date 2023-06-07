package Introduccion;

import java.util.Scanner;
public class Ejecucion2 {
    public static void main(String[] args) {
        Double n1, n2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        n1=entrada.nextDouble();
        System.out.println("Digite el segundo numero: ");
        n2=entrada.nextDouble();
        Calculadora operacion = new Calculadora();
        operacion.sumar(n1,n2);
        operacion.restar(n1,n2 );
        operacion.multiplicar(n1, n2);
        operacion.dividir(n1, n2);
        
        entrada.close();
    }
   
}
