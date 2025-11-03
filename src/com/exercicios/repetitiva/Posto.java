package com.exercicios.repetitiva;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int dielse = 0;

        while (combustivel != 4) {

            if (combustivel == 1) {
                alcool += 1;
            }else if (combustivel == 2) {
                gasolina += 1;
            }else if (combustivel == 3) {
                dielse += 1;
            }
            combustivel = sc.nextInt();

        }

        System.out.println("Muito Obirgada");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Dielse: " + dielse);
        sc.close();
    }
}
