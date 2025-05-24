public class RegistroEntradaVehiculo {
    private Vehiculo vehiculo;
    private String fecha;

    public RegistroEntradaVehiculo(Vehiculo vehiculo, String fecha) {
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
        System.out.println("Registro de Entrada de Vehículo:");
        System.out.println(vehiculo.toString());
        System.out.println("Fecha de entrada: " + fecha);
    }
}
