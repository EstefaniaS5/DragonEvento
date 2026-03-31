public abstract class Perfil {
    protected String nombreUsuario;

    public Perfil(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public abstract void mostrarRol();
}
