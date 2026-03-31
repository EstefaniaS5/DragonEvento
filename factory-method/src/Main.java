import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Administrador admin = new Administrador("Dani");
        Usuario usuario = new Usuario("Ana");

        admin.mostrarRol();
        usuario.mostrarRol();

        System.out.print("Ingrese tipo de evento (concierto/conferencia): ");
        String tipo = sc.nextLine();

        System.out.print("Nombre del evento: ");
        String nombre = sc.nextLine();

        System.out.print("Fecha del evento: ");
        String fecha = sc.nextLine();

        System.out.print("Responsable del evento: ");
        String responsabilidad = sc.nextLine();

        System.out.print("Aforo: ");
        int aforo = Integer.parseInt(sc.nextLine());

        System.out.print("Presupuesto de sponsors: ");
        double presupuesto = Double.parseDouble(sc.nextLine());

        System.out.print("Valor de entrada: ");
        double entrada = Double.parseDouble(sc.nextLine());

        CreadorEvento creador;

        if (tipo.equalsIgnoreCase("concierto")) {
            creador = new CreadorConcierto();
        } else {
            creador = new CreadorConferencia();
        }

        Evento evento = admin.ingresarNuevoEvento(
                creador, nombre, fecha, responsabilidad, aforo, presupuesto, entrada
        );

        System.out.println("\nEvento registrado correctamente:");
        evento.mostrarInformacion();

        System.out.println("\n--- Vista del usuario ---");
        usuario.verEvento(evento);

        sc.close();
    }
}