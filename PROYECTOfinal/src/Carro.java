public class Carro extends Vehiculo {
    public Carro(String placa, String modelo, String propietario, String color) {
        super(placa, modelo, propietario, color);
    }

    @Override
    public String toString() {
        return "Carro{}";
    }
}
