package ejercicio04;

import ejercicio02.CalculadoraDeNumeros;
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int numero;
		numero=4;
        
        CalculadoraDeNumeros calculadora = new CalculadoraDeNumeros();

        boolean determinarSiEsPar = calculadora.determinarSiEsPar();
        if (determinarSiEsPar) {
            System.out.println("El número es par, su triple es " + numero * 3);
        } else {
            System.out.println("El número es impar, su doble es " + numero * 2);
        }
    }

		
}		