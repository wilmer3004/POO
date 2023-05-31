package Introduccion;

public class Calculadora {
    //Creamos los atributos 
    private Double num1;
    private Double num2;
    // Creamos el constructor 
    public Calculadora() {
    }
    public Calculadora(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // Sumar
    public Double sumar(Double num1, Double num2) {
        Double suma = 0.0; 
        suma= num1 + num2;
        System.out.println("La suma de los numeros"+num1+" y "+""+num2+" es: " + suma);
        return suma;
    }
    public Double restar(Double num1, Double num2) {
        Double resta = 0.0; 
        resta= num1 - num2;
        System.out.println("La resta de los numeros "+num1+" y "+""+num2+" es: " + resta);
        return resta;
    }
    public Double multiplicar(Double num1, Double num2) {
        Double multiplicacion = 0.0; 
        multiplicacion= num1 * num2;
        System.out.println("La multiplicación de los numeros "+num1+" y "+""+num2+" es: " + multiplicacion);
        return multiplicacion;
    }
    public Double dividir(Double num1, Double num2) {
        Double division = 0.0; 
        division= num1 / num2;
        System.out.println("La division de los numeros "+num1+" y "+""+num2+" es: " + division);
        return division;
    }
    
}
