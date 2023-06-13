package Reto3.Principal;
// Importamos todas las clases que tenemos en el paquete Salud  
import Reto3.Salud.*;
public class Inicio {
    public static void main(String[] args) {
        // Instanciamos la clase Empleado en la cual tenemos nuestros métodos o en otras palabras creamos el objeto que nos servirá para traer los métodos de la clase 
        Empleado empleado = new Empleado();
        // Ejecutamos con el objeto que creamos los métodos de la superClase que se encuentran en ella 
        empleado.pedirDatos();
        empleado.mostrarPersona();
        // Creamos una condicional que nos sirve para que se le indique como esta el peso de la persona según el valor retornado de calcularImc
        if (empleado.calcularImc()>0 && empleado.calcularImc()<20) {
            System.out.println( "PESOBAJO");
        }
        else if (empleado.calcularImc()>=20 && empleado.calcularImc()<=25) { 
            System.out.println( "PESOIDEAL");
        }
        else if(empleado.calcularImc()>25){
            System.out.println( "SOBREPESO");
        
        }
        else{
            System.out.println( "error");
        }
        empleado.mayorEdad();
        // Ejecutamos con el objeto creado los métodos de la subClase
        empleado.solicitarEmpleado(); 
        empleado.mostrarHorario();
    }

}
