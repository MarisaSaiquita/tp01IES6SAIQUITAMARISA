package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA=16;
		int numeroB=-2;
		
		CalculadoraDeNumeros calcu=new CalculadoraDeNumeros();
		calcu.setNumeroA(numeroA);
		calcu.setNumeroB(numeroB);
		
		System.out.println("El resultado de SUMAR es: "+calcu.sumar());
		System.out.println("El resultado de RESTAR es: "+calcu.restar());
		System.out.println("El resultado de MULTIPLICAR es: "+calcu.multiplicar());
		System.out.println("El resultado de DIVIDIR es: "+calcu.dividir());
		System.out.println("El resultado de la POTENCIA es: "+calcu.potencia());
		System.out.println("El resultado de la RAIZ es: "+calcu.raizNumeroA());
		System.out.println("El resultado de la RAIZ es: "+calcu.raizNumeroB());
		
	}

}