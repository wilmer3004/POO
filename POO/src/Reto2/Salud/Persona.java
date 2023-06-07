package Reto2.Salud;

import java.util.Scanner;

public class Persona {
    // Creamos el método constructor
    public Persona() {
    }
    
     public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Definimos los atributos
     private String tipoDoc;
    private int documento;
     private String nombre;
     private String apellido;
     private double peso;
     private double estatura;
     private int edad;
     private String sexo;


     // Creamos los métodos
 
     // Este meto servirá para solicitar los datos
     public void pedirDatos() {
         // Instanciamos la clase Scanner 
         Scanner entrada=new Scanner(System.in);
         // Solicitamos los datos y los capturamos
         System.out.println("Por favor ingrese su tipo de documento: ");
         tipoDoc=entrada.nextLine();
         System.out.println("Por favor ingrese su numero de documento: ");
         documento=entrada.nextInt();
         entrada.nextLine();
         System.out.println("Por favor ingrese su nombre: ");
         nombre=entrada.nextLine();
         System.out.println("Por favor ingrese su apellido: ");
         apellido=entrada.nextLine();
         System.out.println("Por favor ingrese su peso en kg:");
         peso = entrada.nextDouble();
         System.out.println("Por favor ingrese su estatura en metros: ");
         estatura = entrada.nextDouble();
         System.out.println("Por favor ingrese su edad: ");
         edad = entrada.nextInt();
         entrada.nextLine();
         System.out.println("Por favor ingrese su tipo de sexo: ");
         sexo = entrada.nextLine();
         // Limpiamos el buffer
         entrada.close();
     }
     // Este método sirve para mostrar los datos que ingreso la persona
     public void mostrarPersona() {
         System.out.println("Los datos que usted ingreso son los siguientes: ");
         System.out.println("1. " + tipoDoc);
         System.out.println("2. " + documento);
         System.out.println("3. " + nombre);
         System.out.println("4. " + apellido);
         System.out.println("5. " + peso + "kg");
         System.out.println("6. " + estatura + "m");
         System.out.println("7. " + edad);
         System.out.println("8. " + sexo);
     }

     // Este método sirve para calcular el IMC
     public  String calcularImc() {
        double pesoActual = 0;
        pesoActual = peso/Math.pow(estatura, 2);
        if (pesoActual>0 && pesoActual<20) {
            return "PESOBAJO";
        }
        else if (pesoActual>=20 && pesoActual<=25) { 
            return "PESOIDEAL";
        }
        else if(pesoActual>25){
            return "SOBREPESO";
        
        }
        else{
            return "error";
        }
     }
    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad.");
        } else if (edad>0 && edad<18) {
            System.out.println("Usted es menor de edad."); 
        }
        else{
            System.out.println("Usted ingreso un dato no valido.");
        }
    }
}
