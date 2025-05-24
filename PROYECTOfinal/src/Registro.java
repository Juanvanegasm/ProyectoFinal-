public abstract class Registro {

    protected Computador computador;
    protected Vehiculo vehiculo;
    protected String fecha;

    // Constructor para registros de computador
    public Registro(Computador computador, String fecha) {
        this.computador = computador;
        this.fecha = fecha;
    }

    // Constructor para registros de vehículo
    public Registro(Vehiculo vehiculo, String fecha) {
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
