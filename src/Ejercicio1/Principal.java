package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		// TEST E1 A/B/C  //
		e1.setDni("46895255");
		e1.VerificarDNI(e1.getDni());
		e2.VerificarDNI(e2.getDni());
		// -------------- //
	}

}
