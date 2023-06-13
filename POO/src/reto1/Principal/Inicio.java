package reto1.Principal;
// Importamos el paquete en el cual tenemos nuestros métodos que creamos
import reto1.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        // Instanciamos la clase Persona en la cual tenemos nuestros métodos o en otras palabras creamos el objeto que nos servirá para traer los métodos de la clase 
        Persona persona = new Persona();
        // Ejecutamos con el objeto que creamos los métodos que se encuentran en el
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }

}
