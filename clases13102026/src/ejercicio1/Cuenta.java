package ejercicio1;

public class Cuenta {
    //Crear un atributo
    //modificador de acceso (public/private/protected) + tipo + nombre;
    //public: es accesible fuera y dentro de su clase
    //private: es accesible SOLO DENTRO DE SU CLASE.
    //Encapsulación: atributos privados + métodos públicos get y set
    private String cliente;
    private double interes;
    private String numeroCuenta;
    private double saldo;


    /*CONSTRUCTORES -> POR DEFECTO, POR PARAMETROS, COPIA*/
    //public + nombre de la clase (parametros)

    public Cuenta(String cliente, double interes, String numeroCuenta, double saldo){
        this.cliente = cliente;
        this.interes = interes;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta(){
        this.saldo = 746;
    }



    //GET -> public + tipo + nombre(){
    // return valor;
    // }

    public String getCliente() {
        return cliente;
    }

    public double getInteres() {
        return interes;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter -> public + void + nombre(ATRIBUTO OBLIGATORIO){
    // this.atributo = parametro;
    //}

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setInteres(double interes){
        this.interes = interes;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}


