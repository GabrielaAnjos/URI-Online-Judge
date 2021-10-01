package urijudge.desafios.iniciante;
/**
 * Escreva um programa que leia um valor inteiro N (1 < N < 1000).
 * Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class URI1143QuadradoEAoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) {
            int num2 = (int) Math.pow(num,2);
            int num3 = (int) Math.pow(num,3);
            System.out.printf("%d %d %d\n", num, num2, num3);
        }
        sc.close();
    }
}
