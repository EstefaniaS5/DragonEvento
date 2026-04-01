public class CreadorConferencia extends CreadorEvento {

    @Override
    public Evento crearEvento(String nombre, String fecha, String responsabilidad,
                              int aforo, double presupuestoSponsors, double valorEntrada) {
        return new EventoConferencia(nombre, fecha, responsabilidad, aforo, presupuestoSponsors, valorEntrada);
    }
}
