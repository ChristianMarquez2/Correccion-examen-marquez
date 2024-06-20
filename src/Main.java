public class Main {
    public static void main(String[] args) {

        Ruta rutaQuitoGuayaquil = new Ruta("Quito", "Guayaquil", 20);
        Pasajero pasajero1 = new Pasajero("Christian Márquez", "1751486331", "0980865549");
        Normal ticketNormal = new Normal(rutaQuitoGuayaquil, pasajero1, "Ventana", true, true);
        VIP ticketVIP = new VIP(rutaQuitoGuayaquil, pasajero1, new String[]{"Televisión", "Internet"}, true, true);

        System.out.println("Información del ticket Normal:");
        ticketNormal.imprimirTicket();
        System.out.println("\nInformación del ticket VIP:");
        ticketVIP.imprimirTicket();

        Normal ticketNormalNulo = new Normal(null, null, null, false, false);
        VIP ticketVIPNulo = new VIP(null, null, null, false, false);
        Ruta rutaNula = new Ruta(null, null, 0);
        Pasajero pasajeroNulo = new Pasajero(null, null, null);
        Servicio servicioNulo = new Servicio(null, 0);

        ticketNormalNulo.setRuta(rutaQuitoGuayaquil);
        ticketNormalNulo.setPasajero(pasajero1);
        ticketNormalNulo.setSeleccionAsiento("Pasillo");
        ticketNormalNulo.setEspacioMaleta(true);
        ticketNormalNulo.setMaletaAdicional(true);

        ticketVIPNulo.setRuta(rutaQuitoGuayaquil);
        ticketVIPNulo.setPasajero(pasajero1);
        ticketVIPNulo.setServiciosAdicionales(new String[]{"Comida", "Bebida"});
        ticketVIPNulo.setEspacioMaleta(true);
        ticketVIPNulo.setMaletaAdicional(true);

        rutaNula.setOrigen("Quito");
        rutaNula.setDestino("Riobamba");
        rutaNula.setPrecioNormal(17.50);

        pasajeroNulo.setNombre("Jennifer Zambrano");
        pasajeroNulo.setCedula("1751486320");
        pasajeroNulo.setTelefono("0981234567");

        servicioNulo.setNombre("Asiento Reclinado");
        servicioNulo.setCostoAdicional(5);

        System.out.println("\nInformación del ticket Normal con valores nulos seteados:");
        ticketNormalNulo.imprimirTicket();
        System.out.println("\nInformación del ticket VIP con valores nulos seteados:");
        ticketVIPNulo.imprimirTicket();
        System.out.println("\nInformación de la ruta con valores nulos seteados:");
        System.out.println(rutaNula);
        System.out.println("\nInformación del pasajero con valores nulos seteados:");
        System.out.println(pasajeroNulo);
        System.out.println("\nInformación del servicio con valores nulos seteados:");
        System.out.println(servicioNulo);

        Ruta rutaQuitoTulcan = new Ruta("Quito", "Tulcán", 17.50);
        Pasajero pasajero2 = new Pasajero("Paul Quiñones", "1751486352", "0980987654");
        Normal ticketNormal2 = new Normal(rutaQuitoTulcan, pasajero2, "Ventana", true, false);
        VIP ticketVIP2 = new VIP(rutaQuitoTulcan, pasajero2, new String[]{"Películas", "Revistas"}, true, true);

        System.out.println("\nInformación del segundo ticket Normal:");
        ticketNormal2.imprimirTicket();
        System.out.println("\nInformación del segundo ticket VIP:");
        ticketVIP2.imprimirTicket();
    }
}
