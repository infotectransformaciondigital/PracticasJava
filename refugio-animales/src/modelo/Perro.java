package modelo;

public class Perro extends Animal {
    public String color;
    
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando al perro " + getNombre());
    }
}
