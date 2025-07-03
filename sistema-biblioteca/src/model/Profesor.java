package model;

public class Profesor extends Usuario{

    public Profesor(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public String tipoUsuario() {
        return "Soy profesor";
    }

}
