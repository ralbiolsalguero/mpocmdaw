package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal();

    }
}

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El Perro hace guau guau");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau miau");
    }
}

//Virtual Method Invocation