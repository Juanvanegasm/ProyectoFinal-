public class Bicicleta extends Vehiculo {
    private String numeroserie;

    public Bicicleta(String placa, String modelo, String propietario, String color, String numeroserie) {
        super(placa, modelo, propietario, color);
        this.numeroserie = numeroserie;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroserie='" + numeroserie + '\'' +
                '}';
    }
}


