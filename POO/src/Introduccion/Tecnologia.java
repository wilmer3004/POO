package Introduccion;

import java.util.Scanner;

public class Tecnologia {
    // Atributos
    private int idTecnologia;
    private int capacidadMemoria  ;
    private String nombreProcesador;
    private String nombreTecnologia;
    // Métodos
    // Este método sirve para capturar los datos que requerimos de tecnología
    public void registarTecnologia(){
    // Instanciamos la clase Scanner
    Scanner entrada = new Scanner(System.in);
    // Solicitamos datos
    System.out.println("Ingrese el id de la tecnología: ");
    // Capturamos datos
    idTecnologia = entrada.nextInt();
    // Solicitamos datos
    System.out.println("Ingrese el nombre que tiene la tecnología: ");
    // Capturamos datos
    nombreTecnologia = entrada.nextLine();
     // Solicitamos datos
     System.out.println("Ingrese la capacidad que tiene el "+nombreTecnologia+": ");
     // Capturamos datos
     capacidadMemoria = entrada.nextInt();
     // Solicitamos datos
     System.out.println("Ingrese el procesador que tiene el "+nombreTecnologia+": ");
     // Capturamos datos
     nombreProcesador = entrada.nextLine();
    // Mostramos los datos que registro el usuario
    System.out.println("\nLos datos registrados son: \n" + idTecnologia + "\n"+ nombreTecnologia + "\n" + capacidadMemoria + "\n" + nombreProcesador);

    // Limpiamos el buffer
    entrada.close();
    }
    // Este método sirve para consultar los datos almacenados de tecnología
    public void consultarTecnologia(){

    }
    // Este método sirve para modificar los datos almacenados de tecnología
    public void modificarTecnologia() {
        
    }
    // Método constructor
    public Tecnologia() {
    }







}
