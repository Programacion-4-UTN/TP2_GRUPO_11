package Ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();

		Empleado emp1 = new Empleado("11111111", "Juan", "Pérez", LocalDate.of(1990, 1, 15), "Masculino", "Calle 1", "111111", "juan@mail.com", "Sistemas");
		Empleado emp2 = new Empleado("22222222", "Ana", "Gómez", LocalDate.of(1992, 5, 20), "Femenino", "Calle 2", "222222", "ana@mail.com", "RRHH");
		Empleado emp3 = new Empleado("33333333", "Pedro", "López", LocalDate.of(1988, 8, 10), "Masculino", "Calle 3", "333333", "pedro@mail.com", "Contabilidad");
		Empleado emp4 = new Empleado("44444444", "Lucía", "Díaz", LocalDate.of(1995, 3, 25), "Femenino", "Calle 4", "444444", "lucia@mail.com", "Ventas");
		Empleado emp5 = new Empleado("55555555", "Carlos", "Sosa", LocalDate.of(1993, 11, 5), "Masculino", "Calle 5", "555555", "carlos@mail.com", "Soporte");
		
		listaEmpleados.add(emp4); // legajo 1003
		listaEmpleados.add(emp1); // legajo 1000
		listaEmpleados.add(emp5); // legajo 1004
		listaEmpleados.add(emp2); // legajo 1001
		listaEmpleados.add(emp3); // legajo 1002
		
		
        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            Empleado emp = it.next();
            System.out.println(emp);
        }
	}

}