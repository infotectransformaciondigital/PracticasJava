package modelo;

public class Leon extends Animal{

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Grrrr!");
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando al leon " + getNombre());
    }
    
}
