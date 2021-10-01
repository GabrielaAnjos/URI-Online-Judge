package urijudge.desafios.iniciante;
/**
 * Faça um programa que leia três valores e apresente o maior dos três valores
 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula.
 *
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
 * Um segundo passo, portanto é necessário para chegar no resultado esperado.
 *
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 *
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.util.Scanner;

public class URI1013_OMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

        input.close();
    }
}
