﻿package urijudge.desafios.matematica;
/**
 * No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível todos os dias.
 * Escreva um algoritmo que leia a capacidade inicial de suprimento de comida (em Kg),
 * e calcule quantos dias passarão antes que Blobs coma todo esse suprimento até restar um quilo ou menos.
 *
 * Entrada
 * A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 1000), indicando o número de casos de teste.
 * As N linhas seguintes contém um valor de ponto flutuante C (1 ≤ C ≤ 1000)
 * correspondente à quantidade de comida disponível para Blobs.
 *
 * Saída
 * Para cada caso de teste, imprima uma linha contendo o número de dias que Blobs irá demorar
 * para comer todo seu suprimento de comida, seguido da palavra "dias".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            double alimento = input.nextDouble();
            int dias = 0;

            while (alimento > 1){
                alimento = alimento / 2;
                dias++;
            }
            System.out.println(dias + " dias");
        }

        input.close();

    }
}
