package Introduccion;

import java.util.Scanner;

public class Tecnologia {
    // Atributos
    private int idTecnologia;
    private int capacidadMemoria  ;
    private String nombreProcesador;
    private String nombreTecnologia;
    public void crud() {
        
    }
    Scanner entrada = new Scanner(System.in);
    // Métodos
    // Método constructor
    public Tecnologia() {
    }

    // Este método sirve para capturar los datos que requerimos de tecnología
    public void registrarTecnologia(){
        // Solicitamos datos
        System.out.println("Ingrese el id de la tecnología: ");
        // Capturamos datos
        idTecnologia=entrada.nextInt();
        entrada.nextLine();
        // Solicitamos datos
        System.out.println("Ingrese el nombre que tiene la tecnología: ");
        // Capturamos datos
        nombreTecnologia=entrada.nextLine();
        // Solicitamos datos
        System.out.println("Ingrese la capacidad que tiene el "+nombreTecnologia+": ");
        // Capturamos datos
        capacidadMemoria=entrada.nextInt();
        // Solicitamos datos
        System.out.println("Ingrese el procesador que tiene el "+nombreTecnologia+": ");
        entrada.nextLine();
        // Capturamos datos
        nombreProcesador=entrada.nextLine();
        // Mostramos los datos que registro el usuario
        System.out.println("\nLos datos registrados son: \n" + idTecnologia + "\n"+ nombreTecnologia + "\n" + capacidadMemoria + "\n" + nombreProcesador);

        
    }
    // Este método sirve para consultar los datos almacenados de tecnología
    public void consultarTecnologia(){
        // Declaramos variables
        int respuesta;
        System.out.println("Que dato desea consultar:\n1. Capacidad de memoria\n2. Nombre del procesador\n3. Nombre de la tecnología\nElija: ");
        respuesta=entrada.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("La capacidad de memoria del equipo es de: " + capacidadMemoria);
                break;
            case 2:
            System.out.println("El procesador del equipo es: " + nombreProcesador);
                break;
            case 3:
            System.out.println("El ombre del equipo ingresado es: " + nombreTecnologia );
                break;
        
            default:
            System.out.println("ERROR !! dígito un dato no valido");
                break;
        }
        // Limpiamos buffer
    }

    // Este método sirve para modificar los datos almacenados de tecnología
    
    public void modificarTecnologia() {
        // Instanciamos la clase Scanner
        // Solicitamos datos y los capturamos
        System.out.println("ingrese el nuevo nombre de la tecnología que dígito, el cual actualmente es: " + nombreTecnologia );

        nombreTecnologia  = entrada.nextLine();
        System.out.println("Ingrese la nueva capacidad de memoria que dígito, la cual actualmente es: " + capacidadMemoria );
        capacidadMemoria  = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nuevo nombre del procesador que dígito, el cual actualmente es: " + nombreProcesador );
        nombreProcesador = entrada.nextLine();
    }
    public void error(){
        System.out.println("ERROR !! dígito un dato no valido");
    }
    
    public void edad(int anio) {
        int anioActual;
        int edad = 0;
        System.out.println("Ingrese el año actual: ");
        anioActual = entrada.nextInt();
        edad = anioActual-anio;
        System.out.println("Su edad es: " + edad);
    

    }
public void limpiar() {
    entrada.close();
}



}
