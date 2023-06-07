package Introduccion;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        // Declaramos variables
        String respuesta, nombre;
        int respuesta1;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Instanciar la clase o crear objeto
        Tecnologia computador = new Tecnologia();
        Computador compu = new Computador();
        computador.edad(2005);
        System.out.println("Va a registrar los datos de la tecnología");
        computador.registrarTecnologia();
        System.out.println("Desea Consultar o actualizar un dato registrado si o no");
        respuesta = entrada.nextLine();

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Que desea hacer: \n1. Actualizar \n2. Consultar \nElija: ");
            respuesta1 = entrada.nextInt();
            switch (respuesta1) {
                case 1:
                    computador.modificarTecnologia();
                    break;

                case 2:
                    computador.consultarTecnologia();
                    break;
            
                default:computador.error();
                    break;
            }
            entrada.nextLine();
            System.out.println("¿Desea volver al actualizar o consultar algún dato? si o no:");
            respuesta = entrada.nextLine();
        }
       System.out.println(computador.getNombreTecnologia());
       computador.setNombreTecnologia("Teléfono");
       System.out.println("Ingrese el nombre de la tecnología:");
       nombre=entrada.nextLine();
       computador.setNombreTecnologia(nombre);
       System.out.println(computador.getNombreTecnologia());
       compu.registrarComputador();
       System.out.println(compu.mostrarComputador());

        // Limpiamos buffer
        entrada.close();
        computador.limpiar();


    }
    
}
