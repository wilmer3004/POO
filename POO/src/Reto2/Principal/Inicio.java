package Reto2.Principal;
// Importamos todas las clases del paquete Salud
import Reto2.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        // Instanciamos la clase Persona en la cual tenemos nuestros métodos o en otras palabras creamos el objeto que nos servirá para traer los métodos de la clase 
        Persona persona = new Persona();
        // Ejecutamos con el objeto que creamos los métodos que se encuentran en el
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        // Creamos una condicional que nos sirve para que se le indique como esta el peso de la persona según el valor retornado de calcularImc
        if (persona.calcularImc()>0 && persona.calcularImc()<20) {
            System.out.println("Su peso es bajo.");
        }
        else if (persona.calcularImc()>=20 && persona.calcularImc()<=25) { 
            System.out.println("Su peso es el ideal.");
        }
        else if(persona.calcularImc()>25){
            System.out.println("Usted se encuentra en sobrepeso.");
        
        }
        else{
            System.out.println("ERROR");
        }
        
        persona.mayorEdad();
    }

}
    