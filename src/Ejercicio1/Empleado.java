package Ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	private static int contadorLegajo = 1000;
	
	private final int legajo;
	private String puesto;
		
	public Empleado()
	{
		super();		
		this.legajo = contadorLegajo++;
		this.puesto = "ingresar puesto";
		
	}
	
	
	public Empleado(String dni,String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto)
	{
		super(dni,nombre,apellido,fechaNacimiento,genero,direccion,telefono,email);
		this.puesto = puesto;
		this.legajo = contadorLegajo++;
		
	}
	
	public static int devuelveProximoLegajo()
	{
		return contadorLegajo;
	}
	

	public int getLegajo() {
		return legajo;
	}

	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

	@Override
	public String toString() {
	    return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "] "
	           + super.toString();
	}
	
	
	

}