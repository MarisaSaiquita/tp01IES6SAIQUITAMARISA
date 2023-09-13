package ejercicio01;

public class Prinicipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres="Marisa del Rosario";
		String apellidos="Saiquita";
		
		Usuario usuario=new Usuario();
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		
		System.out.println("Nombres: "+ usuario.getNombres());
		System.out.println("Apellidos: " +usuario.getApellidos());
		

		}

}