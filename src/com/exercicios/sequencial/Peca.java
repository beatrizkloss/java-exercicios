package com.exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Peca {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, num1, codigo2, num2;
        double valor1, valor2, total;

        codigo1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = valor1 * num1 + valor2 * num2;

        System.out.printf("Valor a Pagar: R$ %.2f\n", total);
        sc.close();

    }
}
