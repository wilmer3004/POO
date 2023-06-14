package Introduccion;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego {
    // Atributos
    private int moneda;
    private String jugador;
    private int eleccion;
    // Metodos constructores
    public Caraysello(){

    }
    
    public Caraysello(int moneda, String jugador, int eleccion) {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }
    // Get and Set

    
    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
// Métodos
// Instanciamos la clase Scanner
Scanner entrada = new Scanner(System.in);
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        jugador = entrada.nextLine();
    }
    public void jugar(){
        System.out.println(jugador + " realice su eleccion \n 1. Cara \n 2. sello:");
        eleccion = entrada.nextInt();
        Random aleatorio = new Random();
        moneda = aleatorio.nextInt(2)+1;
        System.out.println("Moneda girando");

    }
    public void finalizar(){
        if(moneda==1 && eleccion ==1){
            System.out.println("Cayó Cara, ¡Ganaste!");
        }
        else if(moneda==2 && eleccion ==2){
            System.out.println("Cayó Sello, ¡Ganaste!");
        }
        else if(moneda==1 && eleccion ==2){
            System.out.println("Cayó Cara, ¡Perdiste!");
        }
        else if(moneda==2 && eleccion ==1){
            System.out.println("Cayó Sello, ¡Perdiste!");
        }
        else{
            System.out.println("Error no digitate una opción valida");
        }
    }
}
