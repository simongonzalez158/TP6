import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona remitente = new Persona("Juan", "123 Calle A");
        Persona destinatario1 = new Persona("María", "456 Calle B");
        Persona remitente2 = new Persona("Carlos", "789 Calle C");

        // Crear envíos (cartas y paquetes)
        Envio carta = new PaqueteCarta(remitente, destinatario1, false, 0.2f);
        Envio paquete = new PaqueteCarta(remitente, destinatario1, true, 1.5f);
        Envio carta2 = new PaqueteCarta(remitente2, remitente, true, 0.8f);

        // Crear un combo postal
        ComboPostal combo = new ComboPostal();

        // Agregar envíos al combo
        combo.addEnvio(carta);
        combo.addEnvio(paquete);
        combo.addEnvio(carta2);

        // Mostrar información sobre el combo
        System.out.println("Número de seguimiento del combo: " + combo.getNroTracking());
        System.out.println("Dirección del combo: " + combo.getDireccion());
        System.out.println("Destinatario del combo: " + combo.getDestinatario().getNombre());
        System.out.println("Remitente del combo: " + combo.getRemitente().getNombre());
        System.out.println("Peso total del combo: " + combo.getPeso() + " kg");
    }
}
