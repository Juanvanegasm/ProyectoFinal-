public class Vehiculo {
    private String placa, modelo, propietario,color;

    public Vehiculo(String placa, String modelo, String propietario, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", propietario='" + propietario + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
