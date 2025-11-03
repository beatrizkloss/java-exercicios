package com.exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if ( A % B == 0 || B % A == 0) {
            System.out.println("SAO MULTIPLOS");
        }else {
            System.out.println("NÃO SAO MULTIPLOS");
        }
        sc.close();
    }

}
