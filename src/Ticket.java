public class Ticket {
    private Ruta ruta;
    private boolean esVIP;
    private String seleccionAsiento;
    private String[] serviciosAdicionales; // Para VIP
    private boolean espacioMaleta;
    private boolean maletaAdicional;
    private Pasajero pasajero;

    public Ticket(Ruta ruta, boolean esVIP, Pasajero pasajero) {
        this.ruta = ruta;
        this.esVIP = esVIP;
        this.pasajero = pasajero;
    }

    public double calcularCosto() {
        double costo = ruta.getPrecioNormal();
        if (esVIP) {
            costo += costo * 0.3;
            if (maletaAdicional) {
                costo += 10;
            }
        }
        return costo;
    }

    public void imprimirTicket() {
        System.out.println("Ticket de Pasaje");
        System.out.println("Ruta: " + ruta.getOrigen() + " - " + ruta.getDestino());
        if (esVIP) {
            System.out.println("Tipo de Servicio: VIP");
            System.out.println("Servicios Adicionales:");
            for (String servicio : serviciosAdicionales) {
                System.out.println("- " + servicio);
            }
        } else {
            System.out.println("Tipo de Servicio: Normal");
            System.out.println("Selección de Asiento: " + seleccionAsiento);
        }
        System.out.println("Espacio para Maleta: " + (espacioMaleta ? "Sí" : "No"));
        System.out.println("Maleta adicional: " + (maletaAdicional ? "Sí" : "No"));
        System.out.println("Costo: " + calcularCosto());
        System.out.println("Datos del Pasajero: " + pasajero);
    }


    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    public boolean isEsVIP() {
        return esVIP;
    }
    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }
    public String getSeleccionAsiento() {
        return seleccionAsiento;
    }
    public void setSeleccionAsiento(String seleccionAsiento) {
        this.seleccionAsiento = seleccionAsiento;
    }
    public String[] getServiciosAdicionales() {
        return serviciosAdicionales;
    }
    public void setServiciosAdicionales(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    public boolean isEspacioMaleta() {
        return espacioMaleta;
    }
    public void setEspacioMaleta(boolean espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }
    public boolean isMaletaAdicional() {
        return maletaAdicional;
    }
    public void setMaletaAdicional(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}

