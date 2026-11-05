package ejercicioDNI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int num, calculo;

        System.out.println("Introduzca el número del dni");
        num = scn.nextInt();

        calculo = num % 23;

        System.out.println(letra[calculo]);



    }
}
