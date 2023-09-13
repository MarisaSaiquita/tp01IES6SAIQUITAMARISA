package ejercicio02;


public class CalculadoraDeNumeros {
	private int numeroA;
	private int numeroB;
	
public CalculadoraDeNumeros() {
	// TODO Auto-generated constructor stub
}

public int getNumeroA() {
	return numeroA;
}

public void setNumeroA(int numeroA) {
	this.numeroA = numeroA;
}

public int getNumeroB() {
	return numeroB;
}

public void setNumeroB(int numeroB) {
	this.numeroB = numeroB;
}
public int sumar() {
	int resultado=0;
	resultado=numeroA+numeroB;
	return resultado;
	}
public int restar() {
		int resultado=0;
		resultado=numeroA-numeroB;
		return resultado;
}
public int multiplicar () {
	int resultado=0;
	resultado=numeroA*numeroB;
	return resultado;
}
public String dividir () {
	double divisor=numeroB;
	double resultado=0;
	
	if (numeroB != 0){
		resultado=numeroA/divisor;
		return resultado +"";
		} else {
			return "No se puede dividir por 0";
			}
	}
public double potencia () {
	double resultado=0;
	resultado= Math.pow(numeroA, numeroB);
	return resultado;	
}
public String raizNumeroA () {
	double radicando=numeroA;
	double resultado=0;
	if (numeroA > 0){
	resultado=Math.sqrt(radicando);
	return resultado + "";
	}else {
		return "El numero A no tiene raiz"; 
	}

}
public String raizNumeroB () {
	double radicando=numeroB;
	double resultado=0;
	if (numeroB > 0){
	resultado=Math.sqrt(radicando);
	return resultado + "";
	}else {
		return "El numero B no tiene raiz"; 
	}
}
public void cuentaAtrasFor(int numero) {
    int contador = numero;
    for  (contador ++; contador > 159; contador -= 20) {

        System.out.println(contador);
    }
}

public void cuentaAtrasWhile(int numero) {
    int contador = numero;
    while (contador >= 160) {
      
    	System.out.println(contador);
        contador -= 20;
    }
}
public void cuentaAtrasDoWhile(int numero) {
    int contador = numero;

    do { System.out.println(contador);
        contador -= 20;
    } while (contador >= 160);
}
public int factorial(int numero) {
    int factorial = 1;

    for (int i = 1; i <= numero; i++) {
        factorial *= i; 
        } return factorial;
    
}

public boolean determinarSiEsPar() {
    int numero=0;
    return numero % 2 == 0;

}

}