package herencia;

public class Vehiculo {
    /*
    * default -> era accesible feura de su paquete
    * public -> era accesible fuera de su clase
    * private -> SOLO es accesible DENTRO de su CLASE.
    * protected -> SOLO es accesible DENTRO de su CLASE y si SE HEREDA
    * */
    protected String modelo;
    protected String matricula;
    protected int potenciaCV;

    public Vehiculo(String modelo, String matricula, int potenciaCV) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
}
