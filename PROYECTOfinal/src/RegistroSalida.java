public class RegistroSalida extends Registro {

    public RegistroSalida(Computador computador, String fecha) {
        super(computador, null, fecha);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Registro de Salida de Computador:");
        System.out.println("Serial: " + computador.getSerial());
        System.out.println("Marca: " + computador.getMarca());

        System.out.println("Fecha de salida: " + fecha);
    }
}
