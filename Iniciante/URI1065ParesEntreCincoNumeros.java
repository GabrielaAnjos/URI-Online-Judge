package urijudge.desafios.iniciante;
/**
 * Faça um programa que leia 5 valores inteiros.
 * Conte quantos destes valores digitados são pares e mostre esta informação.
 *
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 *
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido,
 * indicando a quantidade de valores pares lidos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int par = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();

            if (num % 2 == 0)
                par++;
        }

        System.out.println(par + " valores pares");

        sc.close();

    }
}
