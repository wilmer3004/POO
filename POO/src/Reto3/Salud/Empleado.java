package Reto3.Salud;

import java.util.Scanner;
// Utilizamos la palabra reservada extends para indicar que es una subclase de Persona
public class Empleado extends Persona{

// Definimos los atributos

private String cargo;
private int valorHora;
private int horasTrabajadas;
private String departamento;
private Double totalPagar;
// Creamos el método constructor
public Empleado() {
}
// Creamos el método constructor con parámetros propios y de la super clase
public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad,
        String sexo, String cargo, int valorHora, int horasTrabajadas, String departamento) {
    // Inicializamos con la palabra reservada super los parámetros de la superclass
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.departamento = departamento;
}

    // Definimos los métodos modificadores y de acceso Get and Set
public String getCargo() {
    return cargo;
}
public int getValorHora() {
    return valorHora;
}
public int getHorasTrabajadas() {
    return horasTrabajadas;
}
public String getDepartamento() {
    return departamento;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public void setValorHora(int valorHora) {
    this.valorHora = valorHora;
}
public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}

public Double getTotalPagar() {
    return totalPagar;
}

public void setTotalPagar(Double totalPagar) {
    this.totalPagar = totalPagar;
}
// Este método nos servirá para solicitar los datos que necesitemos del empleado para definir cual sera su pago
public void solicitarEmpleado() {
    // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos los datos y los capturamos
    System.out.println("Ahora vamos a tomar los datos del empleado.");
        System.out.println("Digite el cargo del empleado:");
        cargo= entrada.nextLine();
        System.out.println("Digite el departamento en el cual se encuentra encargado el empleado:");
        departamento = entrada.nextLine();
        System.out.println("Digite la valor por hora de pago del empleado:");
        valorHora = entrada.nextInt();
        System.out.println("Digite la cantidad de horas que trabajo el empleado:");
        horasTrabajadas = entrada.nextInt();
}
public Double calcularHorario() {
    // Declaramos las variables que nos servirán para realizar las operaciones
    Double valorTotal=0.0;
    Double reteica = 0.0;
    // Realizamos la operacion para calcular el valor total sin reteica que se le tiene que pagar al empleado
    valorTotal = valorTotal +( valorHora * horasTrabajadas); 
    // Calculamos el reteica
    reteica = 0.00966/valorTotal;
    // Finalmente calculamos cuanto se le tiene que pagar en total al empleado
    totalPagar = valorTotal-reteica;
// Retornamos el total a pagar al empegado
    return totalPagar;

}
// Este método nos servirá para mostrar datos del empleado y cuanto se le tendrá que pagar en total
public void mostrarHorario() {
    System.out.println( "El empleado con tipo de identificación " + getTipoDoc() + " # " + getDocumento()+ " cuyo nombre es "+ getNombre()+ " " + getApellido()+ " donde su cargo dentro de la empresa es " + getCargo() + " con un total de horas trabajadas de " + getHorasTrabajadas()+ " cuyo valor por hora es de $"+ getValorHora()+" Y el total que se le tiene que pagar al empleado es de: $"+getTotalPagar());
}











    
}
