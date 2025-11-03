package com.exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, numHoras;
        double valorHora, salario;

        numFuncionario = sc.nextInt();
        numHoras = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = numHoras * valorHora;
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);



    }
}
