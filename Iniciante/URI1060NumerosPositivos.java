package urijudge.desafios.iniciante;
/**
 * Faça um programa que leia 6 valores.
 * Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
 * A seguir, mostre a quantidade de valores positivos digitados.
 *
 * Entrada
 * Seis valores, negativos e/ou positivos.
 *
 * Saída
 * Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont=0;
        double num;
        for (int i = 0; i < 6; i++) {
            num = input.nextDouble();

            if (num >= 0) cont++;
        }

        System.out.println(cont + " valores positivos");

        input.close();
    }
}
