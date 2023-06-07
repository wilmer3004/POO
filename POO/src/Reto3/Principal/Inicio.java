package Reto3.Principal;

import Reto3.Salud.*;
public class Inicio {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        empleado.pedirDatos();
        empleado.mostrarPersona();
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
        empleado.solicitarEmpleado(); 
        empleado.mostrarHorario();
    }

}
