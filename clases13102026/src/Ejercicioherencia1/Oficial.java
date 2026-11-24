package Ejercicioherencia1;

public class Oficial extends Operario {
    public Oficial() {

    }

    public Oficial(String nombre) {
        super(nombre);
    }

    public String toString() {
        return super.toString() +" -> Oficial";
    }
}
