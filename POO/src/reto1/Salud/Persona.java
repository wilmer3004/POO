package reto1.Salud;

import java.util.Scanner;

public class Persona {
    // Creamos el método constructor
    public Persona() {
    }
    // Creamos el método constructor con parámetros
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
 
     // Este metodo servirá para solicitar los datos
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
        // Se muestran los atributos que se ingresaron por el usuario
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
     public void calcularImc() {
        // Declaramos la variable que nos servirá para calcular el IMC
        double pesoActual = 0;
        // Realizamos la operacion
        pesoActual = peso/Math.pow(estatura, 2);
        // Creamos una condicional que nos sirve para que se le indique como esta el peso de la persona según su resultado del imc
        if (pesoActual>0 && pesoActual<20) {
            System.out.println("Su peso esta por debajo de lo ideal.");
        }
        else if (pesoActual>=20 && pesoActual<=25) {
            System.out.println("Su peso es ideal.");
        }
        else if(pesoActual>25){
            System.out.println("Usted actualmente tiene sobrepeso.");
        }
     }
    //  Este método sirve para definir según la edad del usuario si es mayor de edad o no 
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
