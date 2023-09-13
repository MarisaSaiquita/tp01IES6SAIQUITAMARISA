package ejercicio05;

import ejercicio02.CalculadoraDeNumeros;
public class Principal {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    int numero;
    numero =4;
    if (numero < 0 || numero > 10) {
        System.out.println("El número ingresado no está dentro del rango");
        return;
    }

    CalculadoraDeNumeros calculadora = new CalculadoraDeNumeros();

    int factorial = calculadora.factorial(numero);

    System.out.println("El factorial de " + numero + " es " + factorial);

}

}