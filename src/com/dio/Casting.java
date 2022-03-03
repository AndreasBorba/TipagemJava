package com.dio;

public class Casting {

    /* Dentro de casting, existem dois tipos:

     1- Upcast;
     2- Downcast.

    A diferança esta sobre a tipagem, por exemplo:
    Se tentarmos converter um inteiro para long, não é necessario deixar explicito.
    Mas quando acontece o inverso, será necessário deixar evidente, conforme o exemplo abaixo:
    long i = 5l;
    int a = 0;
    int a = (int) i;

    */

    public static void main (String[] args){
        casting();
    }

    public static void casting(){

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 100000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 1000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10800.58;
        f2 = (float) d2;

        // Para o exemplo abaixo, haverá perda de informação

        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888888889;
        f3 = (float) d3;
        System.out.println(f3);

        // Truncar informações para um número inteiro

        int i4;
        float f4 = 11.5697f;
        i4 = (int)f4;

        System.out.println(i4);

    }

}
