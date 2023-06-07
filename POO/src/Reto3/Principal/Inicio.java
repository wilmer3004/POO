package Reto3.Principal;
import java.util.Scanner;

import Reto3.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        String cargo1, departamento1;
        int hTrabajada, hValor;

        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        if (persona.calcularImc().equals("PESOBAJO")) {
            System.out.println("Su peso es bajo.");
        }
        if (persona.calcularImc().equals("PESOIDEAL")) {
            System.out.println("Su peso es el ideal.");
        }
        if (persona.calcularImc().equals("SOBREPESO")) {
            System.out.println("Usted se encuentra en sobrepeso.");
        }
        else{
            System.out.println(persona.calcularImc());;
        }
        
        persona.mayorEdad();

        System.out.println("Ahora vamos a tomar los datos del empleado.");
        System.out.println("Digite el cargo del empleado:");
        cargo1 = entrada.nextLine();
        empleado.setCargo(cargo1);
        System.out.println("Digite el departamento en el cual se encuentra encargado el empleado:");
        departamento1 = entrada.nextLine();
        empleado.setDepartamento(departamento1);
        System.out.println("Digite la valor por hora de pago del empleado:");
        hValor = entrada.nextInt();
        empleado.setValorHora(hValor);
        System.out.println("Digite la cantidad de horas que trabajo el empleado:");
        hTrabajada = entrada.nextInt();
        empleado.setHorasTrabajadas(hTrabajada);

        System.out.println(empleado.calcularHorario());

        entrada.close();
    }

}
