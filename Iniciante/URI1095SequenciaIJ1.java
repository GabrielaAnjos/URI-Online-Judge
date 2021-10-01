package urijudge.desafios.iniciante;
/**
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 *
 * Entrada
 * Não há nenhuma entrada neste problema.
 *
 * Saída
 * Imprima a sequencia conforme exemplo abaixo
 *
 * I=1 J=60
 * I=4 J=55
 * I=7 J=50
 * ...
 * I=? J=0
 */

import java.util.Scanner;

public class URI1095SequenciaIJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1,j=60;

        while (j >= 0){
            System.out.printf("I=%d J=%d\n", i, j);
            i = i + 3;
            j = j - 5;
        }

        sc.close();
    }
}
