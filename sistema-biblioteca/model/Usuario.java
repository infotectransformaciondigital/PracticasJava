package model;

public abstract class Usuario {
    protected String nombre;
    protected String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public abstract String tipoUsuario();

    // Getter & Setter
    public String getNombre() {
        return this.nombre;
    }


}
