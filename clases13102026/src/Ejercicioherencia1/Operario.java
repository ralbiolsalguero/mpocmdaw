package Ejercicioherencia1;

public class Operario extends Empleado{

    public Operario(){

    }

    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString(){
        return super.toString() + "-> Operario";
    }


}
