package urijudge.desafios.matematica;
/**
 * Leia dois valores inteiros M e N indefinidamente. A cada leitura, calcule e escreva a soma dos fatoriais de cada um dos valores lidos.
 * Utilize uma variável apropriada, pois cálculo pode resultar em um valor com mais de 15 dígitos.
 *
 * Entrada
 * O arquivo de entrada contém vários casos de teste.
 * Cada caso contém dois números inteiros M (0 ≤ M ≤ 20) e N (0 ≤ N ≤ 20).
 * O fim da entrada é determinado por eof.
 *
 * Saída
 * Para cada caso de teste de entrada, seu programa deve imprimir uma única linha, contendo um número que é a soma de ambos os fatoriais (de M e N).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            int m = input.nextInt();
            int n = input.nextInt();
            long fatorial = (fatorial(m) + fatorial(n));
            System.out.println(fatorial);
        }

        input.close();
    }

    public static long fatorial(int num){
        long fat = 1;

        for (int i = num; i > 0; i--)
            fat *= i;

        return fat;

        }
}
