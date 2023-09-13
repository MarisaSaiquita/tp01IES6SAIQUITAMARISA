package ejercicio01;

public class Usuario {
		private String nombres;
		private String apellidos;
		private String mail;
		private int edad;
		private int ingresosMensuales;
		private int gastosMensuales;
		
	public Usuario() {
		// TODO Auto-generated constructor stub
		
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getIngresosMensuales() {
		return ingresosMensuales;
	}
	public void setIngresosMensuales(int ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}
	public int getGastosMensuales() {
		return gastosMensuales;
	}
	public void setGastosMensuales(int gastosMensuales) {
		this.gastosMensuales = gastosMensuales;
	}
	 public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }
	 public boolean tieneSituacionEconomicaFavorable() {
	        return ingresosMensuales - gastosMensuales >= 0;
	        }
	 public boolean puedeAhorrar() {
		 return tieneSituacionEconomicaFavorable() && ingresosMensuales - gastosMensuales > 100;
	 }
	 
}