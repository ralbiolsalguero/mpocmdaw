package abstracción;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInfo() {
        return marca + " " + modelo;
    }

    public abstract double calcularAlquiler(int dias);
}

class Coche extends Vehiculo {
    public Coche(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public double calcularAlquiler(int dias) {
        return 50 * dias;
    }

}

class Moto extends Vehiculo {
    public Moto(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public double calcularAlquiler(int dias) {
        return 30*dias;
    }
}