package urijudge.desafios.iniciante;
/**
 * Leia 100 valores inteiros.
 * Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 *
 * Entrada
 * O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 *
 * Saída
 * Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor;
        int maior = 0;
        int posMaior = 0;

        for (int i = 1; i <= 100; i++) {
            valor = sc.nextInt();
            if (i == 1){
                maior = valor;
                posMaior = 1;
            } else if (valor > maior){
                maior = valor;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);

        sc.close();
    }
}
