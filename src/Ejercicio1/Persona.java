package Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, 
	String genero,String direccion, String telefono, String email) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Persona() {
        this.nombre = "sin nombre";
        this.fechaNacimiento = LocalDate.of(2025, 1, 1);
        this.dni = "0";
        this.apellido = "sin apellido";
        this.genero = "No especificado";
        this.direccion = "Sin direccion";
        this.telefono = "0";
        this.email = "sin email";
    }

	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//E1 PUNTO C.
	public static void VerificarDNI(String dni) {

	    // 1. Validar longitud (8 dígitos)
	    if (dni.length() != 8) {
	        throw new ExVerificarDNI();
	    }

	    // 2. Validar que todos sean caracteres numericos
	    for (int i = 0; i < dni.length(); i++) {
	        if (!Character.isDigit(dni.charAt(i))) {
	            throw new ExVerificarDNI();
	        }
	    }
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	

}











