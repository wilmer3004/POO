package Introduccion;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego {
    private String nombre;
    private int opcionJugador;
    private int numAle;
    // Métodos constructor
    Scanner entrada = new Scanner(System.in);
    public Ppt() {
    }
    public Ppt(String nombre, int opcionJugador, int numAle) {
        this.nombre = nombre;
        this.opcionJugador = opcionJugador;
        this.numAle = numAle;
    }

    // Get and Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getOpcionJugador() {
        return opcionJugador;
    }
    public void setOpcionJugador(int opcionJugador) {
        this.opcionJugador = opcionJugador;
    }
    public int getNumAle() {
        return numAle;
    }
    public void setNumAle(int numAle) {
        this.numAle = numAle;
    }
    

    // Métodos
    
    
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.nextLine();
    }
    public void jugar(){
        System.out.println(nombre+" por favor digite una opcion: \n 1. Piedra \n 2. Papel \n 3. Tijera");
        opcionJugador = entrada.nextInt();
        Random aleatorio = new Random();
        numAle = aleatorio.nextInt(3)+1;

    }
    public void finalizar(){
switch (opcionJugador) {
            // Evaluamos en el caso 1
            case 1:
            // Creamos una condición dentro del caso para que evalué las 3 posibles opcionJugadores que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
            if (numAle == 1) {
                System.out.println("La maquina eligió piedra por lo tanto usted empato");
            }
            else if (numAle == 2){
                System.out.println("La maquina eligió papel por lo tanto lo sentimos usted perdió");
            }
            else if (numAle == 3){
                System.out.println("La maquina eligió tijera por lo tanto felicidades usted gano");
            }
                break;
            // Evaluamos en el caso 2
                case 2:
            // Creamos una condición dentro del caso para que evalué las 3 posibles opcionJugadores que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
            if (numAle == 1) {
                System.out.println("La maquina eligió piedra por lo tanto felicidades usted gano");
            }
            else if (numAle == 2){
                System.out.println("La maquina eligió papel por lo tanto usted empato");
            }
            else if (numAle == 3){
                System.out.println("La maquina eligió tijera por lo tanto lo sentimos usted perdió");
            }
                break;
            // Evaluamos en el caso 3  
                case 3:
            // Creamos una condición dentro del caso para que evalué las 3 posibles opcionJugadores que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
            if (numAle == 1) {
                System.out.println("La maquina eligió piedra por lo tanto lo sentimos usted perdió");
            }
            else if (numAle == 2){
                System.out.println("La maquina eligió papel por lo tanto felicidades usted gano");
            }
            else if (numAle == 3){
                System.out.println("La maquina eligió tijera por lo tanto usted empato");
            }
                break;
        // En caso de que no se cumpla ningún caso se le va a indicar al usuario que no eligió ni 1 ni 2 ni 3
            default: System.out.println("Usted no eligió 1, 2 o 3");
                break;
        }
    }
    
}
