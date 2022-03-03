package com.dio;

public class Operador {
    public static void main(String[] args) {
        prePos();
        separadorLayout();
        aritmetico();
        separadorLayout();
        atribuicao();
        separadorLayout();
        precedencia();
    }

    public static void prePos() {
        int k = 10;
        int a = 10;

        int i = ++k; // Pre incrementado, a operação reflete antes da atribuição
        int b = a++; // Pos incrementado, a operação reflete após a atribuição
        imprimeResultado("" + i);
        imprimeResultado("" + b);

        int j = k--;
        imprimeResultado("" + j);

        int x = k;
        imprimeResultado("" + x);
    }
    public static void aritmetico(){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b; // Adição
        int r2 = c-a; // Subtração
        int r3 = d*b; // Multiplicação
        int r4 = e/a; // Divisão
        int r5 = c%b; // Resto da divisão

        imprimeResultado("" + r1);
        imprimeResultado("" + r2);
        imprimeResultado("" + r3);
        imprimeResultado("" + r4);
        imprimeResultado("" + r5);
    }
    public static void atribuicao (){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        imprimeResultado("" + i);
        imprimeResultado("" + j);
        imprimeResultado("" + d);
        imprimeResultado("" + l);
        imprimeResultado("" + k);
    }

    public static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580
        imprimeResultado("" + a);
        imprimeResultado("" + i); // 11

        int b = k  / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        int c = 2;

        c *= i += 5; // Atribuição com adição tem prevalência em relação a multiplicação

        imprimeResultado("" + c);

    }



    public static void imprimeResultado(String a){
        System.out.println(a);
    }

    public static void separadorLayout(){
        System.out.println("\n________________\n");
    }
}
