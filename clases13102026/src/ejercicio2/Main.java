package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        Contador c1 = new Contador(); //defecto

        System.out.println("Introduzca el valor para inicializar el contador");
        n = scn.nextInt();

        c1.setCont(n);

        c1.incrementar();

        System.out.println(c1.getCont());

        c1.incrementar();
        c1.incrementar();

        System.out.println(c1.getCont());

        c1.decrementar();

        System.out.println(c1.getCont());

        Contador c2 = new Contador(10);

        c2.incrementar();
        System.out.println(c2.getCont());
        c2.decrementar();
        System.out.println(c2.getCont());

        Contador c3 = new Contador(c2);

        System.out.println(c3.getCont());


    }
}
