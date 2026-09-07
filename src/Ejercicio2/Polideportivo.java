package Ejercicio2;

public class Polideportivo implements Edificio, InstalacionDeportiva{
private String nombre;
private double superficie;
 
 
	public Polideportivo()
	
	{
		this.nombre = "nombreDefault";
		this.superficie = 0.0;
	}
	
	
	public Polideportivo(double superficie, String nombre)
	{
		this.nombre =nombre;
		this.superficie = superficie;
	}
	@Override
	public int getTipoDeInstalacion()
	{
		return 1;
	}
	@Override
	public double getSuperficieEdificio()
	{
		return this.superficie;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficieEdificio(double superficie) {
		this.superficie = superficie;
	}
	
	@Override
	public String toString() {
	    return "Polideportivo [Nombre: " + nombre + ", Superficie: " + superficie + " m², Tipo de Instalación: " + getTipoDeInstalacion() + "]";
	}
	
}
