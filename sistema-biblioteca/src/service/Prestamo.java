package service;

import java.time.LocalDate;

import model.Libro;
import model.Usuario;

public class Prestamo implements IPrestamo {

    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo (Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public void realizarPrestamo() {
        if (libro.getDisponible()) {
            libro.setDisponible(false);
            System.out.println("Prestamo del libro " + libro.getTitulo() + " al usuario: " + usuario.getNombre() + " en esta fecha: " + fechaPrestamo);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " No está disponible. Fue prestado prestado");
        }
    }

    // Getter & Setter
    public Usuario getUsuario(){
        return this.usuario;
    }

    public Libro getLibro(){
        return this.libro;
    }

    public LocalDate getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
