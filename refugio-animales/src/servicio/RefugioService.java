package servicio;

import modelo.Animal;
import java.util.ArrayList;
import java.util.List;

public class RefugioService {
    private List<Animal> animales = new ArrayList<>();

    public void registrarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Animal registrado con éxito.");
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            a.mostrarDatos();
            a.hacerSonido();
            System.out.println("------");
        }
    }
}

