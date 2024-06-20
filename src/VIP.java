public class VIP extends Ticket {
    private String[] serviciosAdicionales = new String[2];
    private boolean espacioMaleta;
    private boolean maletaAdicional;

    public VIP(Ruta ruta, Pasajero pasajero, String[] serviciosAdicionales, boolean espacioMaleta, boolean maletaAdicional) {
        super(ruta, true, pasajero);
        this.serviciosAdicionales = serviciosAdicionales;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicional = maletaAdicional;
    }


    public String[] getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public boolean tieneEspacioMaleta() {
        return espacioMaleta;
    }

    public void setEspacioMaleta(boolean espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }

    public boolean tieneMaletaAdicional() {
        return maletaAdicional;
    }

    public void setMaletaAdicional(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto();
        if (maletaAdicional) {
            costo += 10;
        }
        return costo;
    }

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();
        System.out.println("Tipo de Servicio: VIP");
        System.out.println("Servicios Adicionales:");
        for (String servicio : serviciosAdicionales) {
            System.out.println("- " + servicio);
        }
        System.out.println("Espacio para Maleta: " + (espacioMaleta ? "Sí" : "No"));
        System.out.println("Maleta Adicional: " + (maletaAdicional ? "Sí" : "No"));
    }
}
