public class EventoConferencia implements Evento {
    private String nombre;
    private String fecha;
    private String responsabilidad;
    private int aforo;
    private double presupuestoSponsors;
    private double valorEntrada;

    public EventoConferencia(String nombre, String fecha, String responsabilidad,
                             int aforo, double presupuestoSponsors, double valorEntrada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsabilidad = responsabilidad;
        this.aforo = aforo;
        this.presupuestoSponsors = presupuestoSponsors;
        this.valorEntrada = valorEntrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Evento: Conferencia ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Responsable: " + responsabilidad);
        System.out.println("Aforo: " + aforo);
        System.out.println("Presupuesto Sponsors: $" + presupuestoSponsors);
        System.out.println("Valor de Entrada: $" + valorEntrada);
    }
}