package POO_DNI;

import java.util.Scanner;

public class Nif {
    private int numero;
    private char letra;

    public Nif(){

    }

    public Nif(int numero){
        this.numero = numero;
        letra = calcularLetra();
    }

    private char calcularLetra(){
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letra[numero % 23];

    }

    public void leer(){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Introduzca dni");
            numero = scn.nextInt();
        }while (numero <= 0);
        letra = calcularLetra();
    }

    @Override
    public String toString(){
        return numero + " - " + letra;
    }

}
