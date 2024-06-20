public class Servicio {
    private String nombre;
    private double costoAdicional;

    public Servicio(String nombre, double costoAdicional) {
        this.nombre = nombre;
        this.costoAdicional = costoAdicional;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoAdicional() {
        return costoAdicional;
    }
    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", costoAdicional=" + costoAdicional +
                '}';
    }
}
