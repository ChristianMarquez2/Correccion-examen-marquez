public class Ruta {
    private String origen;
    private String destino;
    private double precioNormal;

    public Ruta(String origen, String destino, double precioNormal) {
        this.origen = origen;
        this.destino = destino;
        this.precioNormal = precioNormal;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", precioNormal=" + precioNormal +
                '}';
    }
}
