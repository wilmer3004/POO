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
        // Solicitamos y capturamos si se desea averiguar el area de alguna figura
        System.out.println("¿Desea calcular el area de alguna figura? \n1. si\n2. no\nElija: ");
        respuesta = entrada.nextInt();
        // Creamos un bucle while para que se ejecute siempre y cuando la respuesta del usuario sea acertada
        while (respuesta == 1) {
            // Solicitamos al usuario que figura desea calcular
            System.out.println("A que figura desea calcularle el area: \n1. Cuadrado \n2. Circulo\n3. Rectángulo\n4. Triangulo\n5. Trapecio\nElija: ");
            // Capturamos el dato solicitado
            respuesta1 = entrada.nextInt();
            // Creamos un switch para que según la selección del usuario se va a ejecutar un objeto con un método distinto para calcular el area de la figura seleccionada
            switch (respuesta1) {
                case 1:
                // En este caso ejecutamos el método para pedir datos y el de calcular area del cuadrado
                cuadrado.pedirLado();
                cuadrado.calcularArea();
                    break;
                case 2:
                 // En este caso ejecutamos el método para pedir datos y el de calcular area del circulo
                circulo.pedirRadio();
                circulo.calcularArea(); 
                    break;
                case 3:
                 // En este caso ejecutamos el método para pedir datos y el de calcular area del rectangulo
                rectangulo.pedirDatosR();
                rectangulo.calcularArea(); 
                    break;
                case 4:
                 // En este caso ejecutamos el método para pedir datos y el de calcular area del triangulo
                triangulo.pedirDatosT();
                triangulo.calcularArea();
                    break;
                case 5:
                 // En este caso ejecutamos el método para pedir datos y el de calcular area del trapecio
                trapecio.pedirDatosTrapecio();
                trapecio.calcularArea();
                    break;
                default:
                System.out.println("ERROR! Ingreso un valor no valido");
                    break;
            }
            
            // Le preguntamos al usuario si desea ingresar otra figura o no para continuar o cerrar el ciclo
            System.out.println("Desea averiguar el area de otra figura: \n1. si\n2. no\nElija:");
            // Capturamos la respuesta
            respuesta = entrada.nextInt();
        }
        
        System.out.println("Finalizo, gracias por utilizar nuestro programa...");

// Limpiamos el buffer
entrada.close();


        
    }
    
}
