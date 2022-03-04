package com.dio;

public class TipagemJava {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; - Quantidade não suportada pelo short

        // int i1 = -10000000000; - Quantidade não suportada pelo int
        int i2 = 20500;

        long l1 = 1000000000000000000L; // LONG são números inteiros com maior capacidade para armazenamento
        long l2 = 2098712341234123412L; // Repare que é necessário acrescentar o L no final

        // float f1 = 4.5; - Se não colocar o F no final para números decimais (float), irá surgir um erro.
        float f2 = 10.68F;

        double d1 = 85.68; // Para o double, não precisamos colocar uma letra correspondente no final.
        double d2 = 85.699d;

        char c1 = 'W'; // Utiliza-se aspas simples
        // char c2 = 'Wa'; Para CHAR, não é permitido armazenar mais de um caractere.
        char c3 =  '\u0057'; // Representação do W - UNICODE

        String st1 = "Fulano"; // Representação de uma String é realizado por aspas duplas
        String st2 = "Cicrano";
        String st3 =  "agb dgb se et oree"; // Pode ser atribuido uma frase para String

        boolean bo1 = true; // Representação lógica. É permitido apenas true ou false
        boolean bo2 = false;

    }
}
