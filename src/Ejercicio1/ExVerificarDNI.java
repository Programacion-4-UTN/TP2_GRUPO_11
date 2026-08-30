package Ejercicio1;

//E1 PUNTO B.
public class ExVerificarDNI extends RuntimeException {
	
	public ExVerificarDNI() {
        super("El DNI debe contener exactamente 8 caracteres numéricos.");
    }
	
	public ExVerificarDNI(String mensaje) {
        super(mensaje);
    }
}
