package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = "Mundo";
		int contadorVocales = 0;
		
		palabra = palabra.toLowerCase();

		for (int i = 0; i < palabra.length(); i++) {
		    char caracter = palabra.charAt(i);
		    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
		        contadorVocales++;
	}
}
		System.out.println("La cantidad de vocales que hay en la palabra es: " + contadorVocales);		
}

}