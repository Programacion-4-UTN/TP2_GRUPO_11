package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

    public static void main(String[] args) {
       
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        
        listaEmpleados.add(new Empleado(
            "11111111", "Lucas", "Martínez", LocalDate.of(1991, 3, 10),
            "Masculino", "Av. San Martín 123", "11223344", "lucas@mail.com", "Desarrollador Java"
        ));

        listaEmpleados.add(new Empleado(
            "22222222", "Carla", "Gómez", LocalDate.of(1994, 7, 22),
            "Femenino", "Calle Belgrano 456", "11334455", "carla@mail.com", "Diseñadora UX"
        ));

        listaEmpleados.add(new Empleado(
            "33333333", "Esteban", "Díaz", LocalDate.of(1988, 1, 15),
            "Masculino", "Av. Rivadavia 789", "11445566", "esteban@mail.com", "Analista QA"
        ));

        listaEmpleados.add(new Empleado(
            "44444444", "Mariana", "López", LocalDate.of(1996, 11, 5),
            "Femenino", "Calle Mitre 321", "11556677", "mariana@mail.com", "Product Owner"
        ));

        listaEmpleados.add(new Empleado(
            "55555555", "Federico", "Pérez", LocalDate.of(1992, 9, 18),
            "Masculino", "Av. Colón 654", "11667788", "federico@mail.com", "DevOps Engineer"
        ));

        
        Iterator<Empleado> iterador = listaEmpleados.iterator();

        System.out.println("=== LISTA DE EMPLEADOS (ITERATOR) ===\n");

       
        while (iterador.hasNext()) {
            Empleado emp = iterador.next();
            System.out.println(emp); 
        }
    }
}
