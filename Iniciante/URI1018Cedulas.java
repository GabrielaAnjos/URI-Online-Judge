package urijudge.desafios.iniciante;

import java.util.Scanner;

/**
 * Leia um valor inteiro.
 * A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
 * A seguir mostre o valor lido e a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 *
 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 * Não esqueça de imprimir o fim de linha após cada linha,
 * caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

public class URI1018Cedulas {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int valorTotal = input.nextInt();

                int notas = valorTotal;

                int notas100 = notas / 100;
                notas -= notas100 * 100;
                int notas50 = notas / 50;
                notas -= notas50 * 50;
                int notas20 = notas / 20;
                notas -= notas20 * 20;
                int notas10 = notas / 10;
                notas -= notas10 * 10;
                int notas5 = notas / 5;
                notas -= notas5 * 5;
                int notas2 = notas / 2;
                notas -= notas2 * 2;
                int notas1 = notas;

                System.out.println(valorTotal);
                System.out.println(notas100 + " nota(s) de R$ 100,00");
                System.out.println(notas50 + " nota(s) de R$ 50,00");
                System.out.println(notas20 + " nota(s) de R$ 20,00");
                System.out.println(notas10 + " nota(s) de R$ 10,00");
                System.out.println(notas5 + " nota(s) de R$ 5,00");
                System.out.println(notas2 + " nota(s) de R$ 2,00");
                System.out.println(notas1 + " nota(s) de R$ 1,00");

                input.close();

    }
}
