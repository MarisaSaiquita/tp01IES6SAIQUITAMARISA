package ejercicio09;

import ejercicio01.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nombres="Marisa del Rosario";
		 String apellidos="Saiquita";
		 String mail="saiquitamarisa@gmail.com";
		 int edad=36;
		 int ingresosMensuales=1000;
		 int gastosMensuales=1200;
		 
		Usuario usuario = new Usuario();
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		usuario.setMail(mail);
		usuario.setEdad(edad);
		usuario.setIngresosMensuales(ingresosMensuales);
		usuario.setGastosMensuales(gastosMensuales);
		

		        System.out.println("Nombres: " + usuario.getNombres());
		        System.out.println("Apellidos: " + usuario.getApellidos());
		        System.out.println("Correo electrónico: " + usuario.getMail());
		        System.out.println("Edad: " + usuario.getEdad());
		        System.out.println("Ingreso mensual: " + usuario.getIngresosMensuales());
		        System.out.println("Gastos mensuales: " + usuario.getGastosMensuales());

		  
		        if (usuario.esMayorDeEdad()) {
		            System.out.println("El usuario es mayor de edad");
		        } else {
		            System.out.println("El usuario es menor de edad");
		         }
		        if (usuario.tieneSituacionEconomicaFavorable()) {
		            System.out.println("El usuario tiene una situación económica favorable");
		        } else {
		            System.out.println("El usuario tiene una situación económica desfavorable");
		        }

		        if (usuario.puedeAhorrar()) {
		            System.out.println("El usuario puede ahorrar");
		        } else {
		            System.out.println("El usuario no puede ahorrar");
		        }
		    }
}
