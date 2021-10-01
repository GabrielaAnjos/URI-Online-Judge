package urijudge.desafios.iniciante;
/**
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste consiste de dois inteiros X e Y.
 * Você deve apresentar a soma de todos os ímpares existentes entre X e Y.
 *
 * Entrada
 * A primeira linha de entrada é um inteiro N que é a quantidade de
 * casos de teste que vem a seguir.
 * Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
 *
 * Saída
 * Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.util.Scanner;

public class URI1099SomaDeImparesConsecutivosII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int somaImpar = 0;

            if (x < y){
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0){
                        somaImpar += j;
                    }
                }
            } else { // x > y || x == y
                for (int j = y + 1; j < x; j++) {
                    if (j % 2 != 0) {
                        somaImpar += j;
                    }
                }
            }
            System.out.println(somaImpar);
        }
        sc.close();
    }
}
