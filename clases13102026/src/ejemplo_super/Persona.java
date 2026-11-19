package ejemplo_super;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

}


class Alumno extends Persona {
    private String curso;

   public Alumno(String nombre, int edad, String curso){
       super(nombre, edad);
       this.curso = curso;
   }
}