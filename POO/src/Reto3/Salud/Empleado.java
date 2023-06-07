package Reto3.Salud;

import java.util.Scanner;

public class Empleado extends Persona{

private String cargo;
private int valorHora;
private int horasTrabajadas;
private String departamento;
private Double totalPagar;
public Empleado() {
}

public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad,
        String sexo, String cargo, int valorHora, int horasTrabajadas, String departamento) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.departamento = departamento;
}
public void solicitarEmpleado() {
        Scanner entrada = new Scanner(System.in);
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
    Double valorTotal=0.0;
    Double reteica = 0.0;
    valorTotal = valorTotal +( valorHora * horasTrabajadas); 
    reteica = 0.00966/valorTotal;
    totalPagar = valorTotal-reteica;

    return totalPagar;

}
public void mostrarHorario() {
    System.out.println( "El empleado con tipo de identificación " + getTipoDoc() + " # " + getDocumento()+ " cuyo nombre es "+ getNombre()+ " " + getApellido()+ " donde su cargo dentro de la empresa es " + getCargo() + " con un total de horas trabajadas de " + getHorasTrabajadas()+ " cuyo valor por hora es de $"+ getValorHora()+" Y el total que se le tiene que pagar al empleado es de: $"+getTotalPagar());
}









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



    
}
