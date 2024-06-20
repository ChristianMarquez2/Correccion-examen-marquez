public class Normal extends Ticket {
    private String seleccionAsiento;
    private boolean espacioMaleta;
    private boolean maletaAdicional;

    public Normal(Ruta ruta, Pasajero pasajero, String seleccionAsiento, boolean espacioMaleta, boolean maletaAdicional) {
        super(ruta, false, pasajero);
        this.seleccionAsiento = seleccionAsiento;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicional = maletaAdicional;
    }

    public String getSeleccionAsiento() {
        return seleccionAsiento;
    }
    public void setSeleccionAsiento(String seleccionAsiento) {
        this.seleccionAsiento = seleccionAsiento;
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
        System.out.println("Tipo de Servicio: Normal");
        System.out.println("Selección de Asiento: " + seleccionAsiento);
        System.out.println("Espacio para Maleta: " + (espacioMaleta ? "Sí" : "No"));
        System.out.println("Maleta Adicional: " + (maletaAdicional ? "Sí" : "No"));
    }
}
