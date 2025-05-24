public class RegistroEntrada extends Registro {

    public RegistroEntrada(Computador computador, String fecha) {
        super(computador, null, fecha);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Registro de Entrada de Computador:");
        System.out.println("Serial: " + computador.getSerial());
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Fecha de entrada: " + fecha);
    }
}
