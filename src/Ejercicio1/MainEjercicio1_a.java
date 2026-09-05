package Ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setDni("AA202020");
		
		try {
				p1.VerificarDNI(p1.getDni());
				System.out.println("Persona agregada correctamente");
		}
		catch (ExVerificarDNI e) {
			System.out.println("Persona no agregada por no verificar DNI");
			System.out.println(e.getMessage());
		}
		
		Persona p2 = new Persona();
		p2.setDni("20202020");
		
		try {
			p2.VerificarDNI(p2.getDni());
			System.out.println("Persona agregada correctamente");
		}
		catch (ExVerificarDNI e) {
			System.out.println("Persona no agregada por no verificar DNI");
			System.out.println(e.getMessage());
		}

	}

}