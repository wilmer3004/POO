package Reto2.Principal;
import Reto2.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona();
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
    }

}
