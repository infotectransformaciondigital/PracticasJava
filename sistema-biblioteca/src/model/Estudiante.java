package model;

public class Estudiante extends Usuario {

    public Estudiante(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public String tipoUsuario() {
        return "Soy estudiante";
    }
    
    
}
