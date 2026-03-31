public class Usuario extends Perfil {

    public Usuario(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombreUsuario + " tiene perfil de USUARIO.");
    }

    public void verEvento(Evento evento) {
        System.out.println("El usuario está viendo el evento:");
        evento.mostrarInformacion();
    }
}