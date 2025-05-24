public abstract class Registro {
    protected Computador computador;
    protected Vehiculo vehiculo;
    protected String fecha;

    public Registro(Computador computador, Vehiculo vehiculo, String fecha) {
        this.computador = computador;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
    }

    public Computador getComputador() {
        return computador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public abstract void mostrarDetalle();
}
