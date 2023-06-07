package Reto3.Salud;
public class Empleado extends Persona{

private String cargo;
private int valorHora;
private int horasTrabajadas;
private String departamento;
public Empleado() {
}

public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento) {
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.departamento = departamento;
}

public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad,
        String sexo, String cargo, int valorHora, int horasTrabajadas, String departamento) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.departamento = departamento;
}
public String calcularHorario() {
    Double valorTotal=0.0;
    Double reteica = 0.0;
    Double totalPagar = 0.0;

    valorTotal = valorTotal +( valorHora * horasTrabajadas); 
    reteica = 0.00966/valorTotal;
    totalPagar = valorTotal-reteica;

    return "El empleado con tipo de identificación " + getTipoDoc() + " # " + getDocumento()+ " cuyo nombre es "+ getNombre()+ " " + getApellido()+ " donde su cargo dentro de la empresa es " + getCargo() + " con un total de horas trabajadas de " + getHorasTrabajadas()+ " cuyo valor por hora es de $"+ getValorHora()+" Y el total que se le tiene que pagar al empleado es de: $"+totalPagar;

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



    
}
