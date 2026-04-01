public class CreadorConcierto extends CreadorEvento {

    @Override
    public Evento crearEvento(String nombre, String fecha, String responsabilidad,
                              int aforo, double presupuestoSponsors, double valorEntrada) {
        return new EventoConcierto(nombre, fecha, responsabilidad, aforo, presupuestoSponsors, valorEntrada);
    }
}
