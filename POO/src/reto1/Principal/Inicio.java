package reto1.Principal;
import reto1.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }

}
