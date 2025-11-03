package com.exercicios.sequencial;

import java.util.Scanner;

public class SomarInteiros {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N1, N2, soma;

       N1 = sc.nextInt();
       N2 = sc.nextInt();
       soma = N1 + N2;
       System.out.println("Soma = " + soma);
       sc.close();
    }
}
