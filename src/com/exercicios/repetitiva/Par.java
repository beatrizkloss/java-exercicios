package com.exercicios.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Par {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            double divisao = (double) a / b;

            if (b != 0) {
                System.out.printf("%.1f\n", divisao);
            }else {
                System.out.println("Divisão Impossivel");
            }
        }
        sc.close();
    }
}
