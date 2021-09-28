package urijudge.desafios.iniciante;
/**
 * Leia um conjunto não determinado de pares de valores M e N
 * (parar quando algum dos valores for menor ou igual a zero).
 * Para cada par lido, mostre a sequência do menor até o maior
 * e a soma dos inteiros consecutivos entre eles (incluindo o N e M).
 *
 * Entrada
 * O arquivo de entrada contém um número não determinado de valores M e N.
 * A última linha de entrada vai conter um número nulo ou negativo.
 *
 * Saída
 * Para cada dupla de valores, imprima a sequência do menor até o maior
 * e a soma deles, conforme exemplo abaixo.
 */

import java.util.Scanner;

public class URI1101_Sequencia_de_Numeros_e_Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, aux, stop=1, soma=0;

        while (stop != 0){

            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= 0 || n <= 0){
                stop = 0;
            } else {
                stop = 1;
                if (n > m){
                    aux = n;
                    n = m;
                    m = aux;
                }
                for (int i = n; i <= m; i++) {
                    System.out.printf("%d ", i);
                    soma += i;
                }
                System.out.printf("Sum=%d\n", soma);
                soma = 0;
            }
        }
        sc.close();
    }
}
