public class RegistroSalidaVehiculo extends Registro {

    public RegistroSalidaVehiculo(Vehiculo vehiculo, String fecha) {
        super(null, vehiculo, fecha);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Registro de Salida de Vehículo:");
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Propietario: " + vehiculo.getPropietario());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Fecha de salida: " + fecha);
    }
}
