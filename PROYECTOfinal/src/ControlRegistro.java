import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControlRegistro {
    private ArrayList<Registro> registros;

    public ControlRegistro() {
        registros = new ArrayList<>();
    }

    // Entradas y salidas de computadores
    public void registrarEntradaComputador(Computador computador) {
        String fecha = obtenerFechaActual();
        RegistroEntrada entrada = new RegistroEntrada(computador, fecha);
        registros.add(entrada);
        System.out.println("Entrada registrada para computador: " + computador.getSerial());
    }

    public void registrarSalidaComputador(String serial) {
        for (Registro r : registros) {
            if (r instanceof RegistroEntrada rec &&
                    rec.getComputador() != null &&
                    rec.getComputador().getSerial().equals(serial) &&
                    !existeSalidaComputador(serial)) {

                String fecha = obtenerFechaActual();
                RegistroSalida salida = new RegistroSalida(rec.getComputador(), fecha);
                registros.add(salida);
                System.out.println("Salida registrada para computador: " + serial);
                return;
            }
        }
        System.out.println("Computador no encontrado o ya tiene salida registrada.");
    }

    // Entradas y salidas de vehículos
    public void registrarEntradaVehiculo(Vehiculo vehiculo) {
        String fecha = obtenerFechaActual();
        RegistroEntradaVehiculo entrada = new RegistroEntradaVehiculo(vehiculo, fecha);
        registros.add(entrada);
        System.out.println("Entrada registrada para vehículo: " + vehiculo.getPlaca());
    }

    public void registrarSalidaVehiculo(String placa) {
        for (Registro r : registros) {
            if (r instanceof RegistroEntradaVehiculo rev &&
                    rev.getVehiculo() != null &&
                    rev.getVehiculo().getPlaca().equals(placa) &&
                    !existeSalidaVehiculo(placa)) {

                String fecha = obtenerFechaActual();
                RegistroSalidaVehiculo salida = new RegistroSalidaVehiculo(rev.getVehiculo(), fecha);
                registros.add(salida);
                System.out.println("Salida registrada para vehículo: " + placa);
                return;
            }
        }
        System.out.println("Vehículo no encontrado o ya tiene salida registrada.");
    }

    // Mostrar registros
    public void mostrarRegistros() {
        System.out.println("\n--- Historial General de Registros ---");
        for (Registro r : registros) {
            r.mostrarDetalle();
            System.out.println("---------------------");
        }
    }

    public void mostrarComputadoresActivos() {
        System.out.println("\n--- Computadores Activos ---");
        for (Registro r : registros) {
            if (r instanceof RegistroEntrada rec &&
                    rec.getComputador() != null &&
                    !existeSalidaComputador(rec.getComputador().getSerial())) {
                rec.mostrarDetalle();
                System.out.println("---------------------");
            }
        }
    }

    public void mostrarVehiculosActivos() {
        System.out.println("\n--- Vehículos Activos ---");
        for (Registro r : registros) {
            if (r instanceof RegistroEntradaVehiculo rev &&
                    rev.getVehiculo() != null &&
                    !existeSalidaVehiculo(rev.getVehiculo().getPlaca())) {
                rev.mostrarDetalle();
                System.out.println("---------------------");
            }
        }
    }

    // Validaciones
    private boolean existeSalidaComputador(String serial) {
        for (Registro r : registros) {
            if (r instanceof RegistroSalida rs &&
                    rs.getComputador() != null &&
                    rs.getComputador().getSerial().equals(serial)) {
                return true;
            }
        }
        return false;
    }

    private boolean existeSalidaVehiculo(String placa) {
        for (Registro r : registros) {
            if (r instanceof RegistroSalidaVehiculo rs &&
                    rs.getVehiculo() != null &&
                    rs.getVehiculo().getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    private String obtenerFechaActual() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
