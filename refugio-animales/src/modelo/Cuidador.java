package modelo;

public class Cuidador {
    public String area;
    public int hiredYear;
    public String estadoCivil;
    public String nombre;

    public Cuidador(String area, int hiredYear, String estadoCivil, String nombre) {
        this.area = area;
        this.hiredYear = hiredYear;
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
    }

    public Cuidador(String area, String estadoCivil, String nombre) {
        this.area = area;
        this.hiredYear = 0;
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
    }

    public Cuidador(){   
    }


    public void metodo1(String area, int hiredYear) {
        System.out.println("Aqui me pongo a bailar");
    }

    public void metodo1(String yy, int xx, int zz) {
        System.out.println("Aqui me pongo a cantar");

    }

    public void metodo1() {
        System.out.println("Aqui me pongo a dormir");
    }

    public void metodo1(String area, String nombre) {
        System.out.println("Aqui me pongo a trabajar");
    }



}
