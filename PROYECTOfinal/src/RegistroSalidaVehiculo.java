public class RegistroSalidaVehiculo {
    private Vehiculo vehiculo;
    private String fecha;

    public RegistroSalidaVehiculo(Vehiculo vehiculo, String fecha) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void mostrarDetalle() {
        System.out.println("Registro de Salida de Vehículo:");
        System.out.println(vehiculo.toString());
        System.out.println("Fecha de salida: " + fecha);
    }
}
