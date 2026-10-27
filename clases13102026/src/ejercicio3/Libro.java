package ejercicio3;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares; //los que tengo en tienda
    private int prestados; //los que presto

    public Libro() {

    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public boolean prestamo(){
        boolean resultado = true;
        if(prestados < ejemplares){
            prestados++;
        }else{
            resultado = false;
        }
        return resultado;
    }

    public boolean devolucion(){
        boolean resultado = true;
        if(prestados != 0){
            prestados--;
        }else{
            resultado = false;
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Titulo: "+this.titulo+", autor: "+this.autor+", nº ejemplares: "+this.ejemplares+", prestados: "+this.prestados;
    }
}
