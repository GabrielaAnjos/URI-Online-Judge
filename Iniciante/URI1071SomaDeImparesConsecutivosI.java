package urijudge.desafios.iniciante;
/**
 * Leia 2 valores inteiros X e Y.
 * A seguir, calcule e mostre a soma dos números impares entre eles.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 *
 * Saída
 * O programa deve imprimir um valor inteiro.
 * Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int somaImpar = 0;

        if (x < y){
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0){
                    somaImpar += i;
                }
            }
        } else { // x > y || x == y
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    somaImpar += i;
                }
            }
        }

        System.out.println(somaImpar);

        sc.close();
    }
}
