public class Moto extends Vehiculo {
    private String cilindraje;

    public Moto(String placa, String modelo, String propietario, String color, String cilindraje) {
        super(placa, modelo, propietario, color);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindraje='" + cilindraje + '\'' +
                '}';
    }
}
