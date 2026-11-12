package POO_fecha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d, m, a;
        System.out.println("Introduzca una fecha");
        d = scn.nextInt();

        System.out.println("Introduzca el mes");
        m = scn.nextInt();

        System.out.println("Introduzca el año");
        a = scn.nextInt();

        Fecha f = new Fecha(d, m, a);

        if (f.fechaCorrecta()) {
            System.out.println("Fecha introducida: " + f);
            System.out.println("Los 10 días siguientes son");
            for (int i = 1; i <= 10; i++) {
                f.diaSiguiente();
                System.out.println(f);
            }
        } else {
            System.out.println("Fecha no valida");
        }

    }
}
