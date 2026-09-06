package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	public static void main(String[] args) {
	Persona p1 = new Persona();
	Persona p2 = new Persona("46023347","Mateo","Moreno", LocalDate.of(2004, 8, 15),"Masculino","Virreyes","123456789","muybien@gmail.com");
	Persona p3 = new Persona("46023347","Martin","Moreno", LocalDate.of(1990, 1, 14),"Masculino","Terra","123456788","ok@gmail.com"); // repito DNI
	Persona p4 = new Persona("46023001","Mariano","Moreno", LocalDate.of(1980, 1, 13),"Masculino","Marte","112345678","nicebien@gmail.com");
	Persona p5 = new Persona("46023007","Agustina","Romero", LocalDate.of(1970, 1, 12),"Femenino","Venus","122345678","joya@gmail.com");
	
	HashSet<Persona> listaPersonas = new HashSet<Persona>();
	
	listaPersonas.add(p1);
    listaPersonas.add(p2);
    listaPersonas.add(p3);
    listaPersonas.add(p4);
    listaPersonas.add(p5);

    Iterator<Persona> it = listaPersonas.iterator();
    while (it.hasNext()) {
        Persona pers = it.next();
        System.out.println(pers); 
    }
}}
