public class Administrador extends Perfil {

    public Administrador(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombreUsuario + " tiene perfil de ADMINISTRADOR.");
    }

    public Evento ingresarNuevoEvento(CreadorEvento creador, String nombre, String fecha,
                                      String responsabilidad, int aforo,
                                      double presupuestoSponsors, double valorEntrada) {
        return creador.crearEvento(nombre, fecha, responsabilidad, aforo, presupuestoSponsors, valorEntrada);
    }
}