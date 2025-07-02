package modelo;

public class Gato extends Animal {

    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando al gato " + getNombre());
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }

   
}

