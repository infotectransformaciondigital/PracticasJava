package app;

import modelo.Perro;import modelo.Cuidador;import modelo.Gato;import modelo.Leon;
import servicio.RefugioService;

public class Main {
    public static void main(String[] args) {
        RefugioService refugio = new RefugioService();
        Perro firulais = new Perro("Firulais", 3);
        Gato michi = new Gato("Michi", 2);
        michi.mostrarDatos();
        Leon alex = new Leon("Alex", 3);
        refugio.registrarAnimal(firulais);
        refugio.registrarAnimal(michi);
        refugio.registrarAnimal(alex);
        refugio.mostrarAnimales();
        System.out.println("--- Vacunación ---");
        firulais.vacunar();
        michi.vacunar();
        alex.vacunar();
        Cuidador cuidador = new Cuidador("RH", 2024, "Soltero", "Roberto");
        Cuidador cuidador2 = new Cuidador("Finanzas", "Casada", "Sofia");
        Cuidador cuidador3 = new Cuidador();
        cuidador.metodo1();
        cuidador2.metodo1("ss","");
        cuidador3.metodo1("s", 0,0);
    }
}
