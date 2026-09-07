package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
		
		listaEdificios.add(new Polideportivo(1500.5, "Polideportivo Central"));
        listaEdificios.add(new Polideportivo(800.0, "Polideportivo Norte"));
        listaEdificios.add(new Polideportivo(2200.75, "Arena Municipal"));
        
        listaEdificios.add(new EdificioDeOficinas(3500.0, 40));
        listaEdificios.add(new EdificioDeOficinas(1200.0, 15));
        
        Iterator<Edificio> it = listaEdificios.iterator();

        while (it.hasNext()) {
            Edificio ed = it.next();
            System.out.println(ed);
        }

	}

}