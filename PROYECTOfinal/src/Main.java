import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControlRegistro controlRegistro = new ControlRegistro();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar entrada de computador");
            System.out.println("2. Registrar salida de computador");
            System.out.println("3. Registrar entrada de vehículo");
            System.out.println("4. Registrar salida de vehículo");
            System.out.println("5. Mostrar todos los registros");
            System.out.println("6. Mostrar computadores activos");
            System.out.println("7. Mostrar vehículos activos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> registrarEntradaComputador(controlRegistro, scanner);
                case 2 -> registrarSalidaComputador(controlRegistro, scanner);
                case 3 -> registrarEntradaVehiculo(controlRegistro, scanner);
                case 4 -> registrarSalidaVehiculo(controlRegistro, scanner);
                case 5 -> controlRegistro.mostrarRegistros();
                case 6 -> controlRegistro.mostrarComputadoresActivos();
                case 7 -> controlRegistro.mostrarVehiculosActivos();
                case 8 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 8);

        scanner.close();
    }

    // --- MÉTODOS AUXILIARES ---
    private static void registrarEntradaComputador(ControlRegistro controlRegistro, Scanner scanner) {
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Serial: ");
        String serial = scanner.nextLine();
        System.out.print("Responsable: ");
        String responsable = scanner.nextLine();

        Computador computador = new Computador(marca, modelo, serial, responsable);
        controlRegistro.registrarEntradaComputador(computador);
    }

    private static void registrarSalidaComputador(ControlRegistro controlRegistro, Scanner scanner) {
        System.out.print("Serial del computador: ");
        String serial = scanner.nextLine();
        controlRegistro.registrarSalidaComputador(serial);
    }

    private static void registrarEntradaVehiculo(ControlRegistro controlRegistro, Scanner scanner) {
        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();

        Vehiculo vehiculo = switch (tipo) {
            case 1 -> new Carro(placa, modelo, propietario, color);
            case 2 -> {
                System.out.print("Cilindraje: ");
                String cilindraje = scanner.nextLine();
                yield new Moto(placa, modelo, propietario, color, cilindraje);
            }
            case 3 -> {
                System.out.print("Número de serie de la bicicleta: ");
                String numeroserie = scanner.nextLine();
                yield new Bicicleta(placa, modelo, propietario, color, numeroserie);
            }
            default -> {
                System.out.println("Tipo inválido. Se cancela la operación.");
                yield null;
            }
        };

        if (vehiculo != null) {
            controlRegistro.registrarEntradaVehiculo(vehiculo);
        }
    }

    private static void registrarSalidaVehiculo(ControlRegistro controlRegistro, Scanner scanner) {
        System.out.print("Placa del vehículo: ");
        String placa = scanner.nextLine();
        controlRegistro.registrarSalidaVehiculo(placa);
    }
}
