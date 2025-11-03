package com.exercicios.condicional;

import java.util.Scanner;

public class LerInteiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }


}
