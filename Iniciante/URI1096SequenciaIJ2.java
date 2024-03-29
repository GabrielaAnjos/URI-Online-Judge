﻿package urijudge.desafios.iniciante;
/**
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 *
 * Entrada
 * Não há nenhuma entrada neste problema.
 *
 * Saída
 * Imprima a sequencia conforme exemplo abaixo
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=7
 * I=3 J=6
 * I=3 J=5
 * ...
 * I=9 J=7
 * I=9 J=6
 * I=9 J=5
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i=1;
        while (i <= 9){
            for (int j = 7; j >= 5 ; j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            i+=2;
        }

        sc.close();
    }
}
