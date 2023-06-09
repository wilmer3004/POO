package Reto4.Figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        // Declaramos variables
        int respuesta, respuesta1;
        // Instanciamos las clases necesarias
        cuadrado cuadrado = new cuadrado();
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Trapecio trapecio = new Trapecio();
        Scanner entrada = new Scanner(System.in);
        // Solicitamos si se desea averiguar el area de alguna f
        System.out.println("¿Desea calcular el area de alguna figura? \n1. si\n2. no\nElija: ");
        respuesta = entrada.nextInt();

        while (respuesta == 1) {
            System.out.println("A que figura desea calcularle el area: \n1. Cuadrado \n2. Circulo\n3. Rectángulo\n4. Triangulo\n5. Trapecio\nElija: ");
            respuesta1 = entrada.nextInt();

            switch (respuesta1) {
                case 1:
                cuadrado.pedirLado();
                cuadrado.calcularArea();
                    break;
                case 2:
                circulo.pedirRadio();
                circulo.calcularArea(); 
                    break;
                case 3:
                rectangulo.pedirDatosR();
                rectangulo.calcularArea(); 
                    break;
                case 4:
                triangulo.pedirDatosT();
                triangulo.calcularArea();
                    break;
                case 5:
                trapecio.pedirDatosTrapecio();
                trapecio.calcularArea();
                    break;
                default:
                System.out.println("ERROR! Ingreso un valor no valido");
                    break;
            }
            

            System.out.println("Desea averiguar el area de otra figura: \n1. si\n2. no\nElija:");
            respuesta = entrada.nextInt();
        }
        
        System.out.println("Finalizo, gracias por utilizar nuestro programa...");


entrada.close();;


        
    }
    
}
