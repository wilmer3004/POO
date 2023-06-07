package Introduccion;

import java.util.Scanner;

public class Computador extends Tecnologia{
   private String nombreTarjetaGrafica;
   private int cantidadVentiladores; 

public Computador(String nombreTarjetaGrafica, int cantidadVentiladores,int idTecnologia, int capacidadMemoria, String nombreProcesador, String nombreTecnologia) {
    super(idTecnologia,capacidadMemoria,nombreProcesador,nombreTecnologia);
    this.nombreTarjetaGrafica = nombreTarjetaGrafica;
    this.cantidadVentiladores = cantidadVentiladores;
}

public Computador() {
}

public void setNombreTarjetaGrafica(String nombreTarjetaGrafica) {
    this.nombreTarjetaGrafica = nombreTarjetaGrafica;
}

public void setCantidadVentiladores(int cantidadVentiladores) {
    this.cantidadVentiladores = cantidadVentiladores;
}

public String getNombreTarjetaGrafica() {
    return nombreTarjetaGrafica;
}

public int getCantidadVentiladores() {
    return cantidadVentiladores;
}
public void registrarComputador() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese en nombre de la tarjeta gráfica que tiene su dispositivo");
    nombreTarjetaGrafica = entrada.nextLine();
    System.out.println("Ingrese la cantidad de ventiladores que tiene su dispositivo");
    cantidadVentiladores = entrada.nextInt();
    entrada.close();
    
}
public String mostrarComputador(){
    return "Su dispositivo " + getNombreTecnologia() + " posee un tarjeta gráfica llamada " + getNombreTarjetaGrafica()+ " con " + getCantidadVentiladores() + " ventiladores.";
}



}
