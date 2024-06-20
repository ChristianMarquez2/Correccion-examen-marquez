public class Main {
    public static void main(String[] args) {

        Ruta rutaQuitoGuayaquil = new Ruta("Quito", "Guayaquil", 20);

        Pasajero pasajero1 = new Pasajero("Christian Márquez", "1751486331", "0980865549");

        Ticket ticketNormal = new Ticket(rutaQuitoGuayaquil, false, pasajero1);
        ticketNormal.setSeleccionAsiento("Ventama");
        ticketNormal.setEspacioMaleta(true);
        ticketNormal.setMaletaAdicional(true);


        Ticket ticketVIP = new Ticket(rutaQuitoGuayaquil, true, pasajero1);
        ticketVIP.setServiciosAdicionales(new String[]{"Televisin", "internet"});
        ticketVIP.setEspacioMaleta(true);
        ticketVIP.setMaletaAdicional(true);

        System.out.println("Informacion del ticket Normal:");
        ticketNormal.imprimirTicket();
        System.out.println("\nInformacion del ticket VIP:");
        ticketVIP.imprimirTicket();
    }
}
