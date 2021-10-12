﻿package urijudge.desafios.iniciante;
/**
 * Escreva um programa que leia um valor inteiro N.
 * Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int cont = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println("PUM");
            cont++;
        }

        input.close();

    }
}
