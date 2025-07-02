package app;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Estudiante;
import model.Libro;
import model.Profesor;
import service.Prestamo;

public class Main {

    public static void main(String arg[]){

        Libro libro1 = new Libro("Cien años de Soledad", "Gabriel García Márquez", "ISBN0001");
        Libro libro2 = new Libro("Piense y hágase rico", "Napoleon Hill", "ISBN0002");
        Libro libro3 = new Libro("Despierta", "Anthony De Mello", "ISBN0003");

        Estudiante estudiante = new Estudiante("Claudia", "claudia@correo.com");
        Profesor profesor = new Profesor("Sandra", "sandra@correo.com");
        
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        Prestamo prestamo1 = new Prestamo(estudiante, libro1, LocalDate.now(), LocalDate.now().plusDays(14));
        prestamo1.realizarPrestamo();
        prestamos.add(prestamo1);

        Prestamo prestamo2 = new Prestamo(profesor, libro2, LocalDate.now(), LocalDate.now().plusDays(14));
        prestamo2.realizarPrestamo();
        prestamos.add(prestamo2);

        Prestamo prestamo3 = new Prestamo(profesor, libro3, LocalDate.now(), LocalDate.now().plusDays(14));
        prestamo3.realizarPrestamo();
        prestamos.add(prestamo3);

        System.out.println("\n📚 Resumen de préstamos activos:");
        for (Prestamo p : prestamos) {
            if (!p.getLibro().getDisponible()) {
                System.out.println("- Libro: " + p.getLibro().getTitulo() +
                        " | Usuario: " + p.getUsuario().getNombre() +
                        " (" + p.getUsuario().tipoUsuario() + ")" +
                        " | Fecha devolución: " + p.getFechaDevolucion());
            }
        }


        

    }
    
}
