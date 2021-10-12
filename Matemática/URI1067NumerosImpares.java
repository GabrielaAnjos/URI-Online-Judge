package urijudge.desafios.matematica;
/**
 * Leia um valor inteiro X (1 <= X <= 1000).
 * Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 *
 * Entrada
 * O arquivo de entrada contém 1 valor inteiro qualquer.
 *
 * Saída
 * Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int aux = 0;

        while (aux <= x){

            if (aux % 2!= 0){
                System.out.println(aux);
            }
            aux++;
        }

        sc.close();
    }
}
