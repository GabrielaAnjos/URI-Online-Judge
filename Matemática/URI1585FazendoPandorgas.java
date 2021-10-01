package urijudge.desafios.matematica;
/**
 * Anastácia adora construir pipas (ou pandorgas) para seus amigos.
 * Pedro, que sabe disso, separou vários retalhos de bambus
 * da fábrica de móveis de seu tio que seriam descartados para dar a Anastácia.
 * Ao entregar os bambus à Anastácia, Pedro perguntou a ela qual era a maior pipa
 * que poderia ser construída com aqueles retalhos de bambus.
 * Anastácia, então, que não é muito boa em calcular, quer que você a ajude nesta tarefa.
 *
 * Obs.: Cada pipa é construída com dois pedaços de bambus amarrados
 * em forma de cruz, formando um losango.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha de entrada contém
 * um inteiro N que indica a quantidade de pipas que serão construídas.
 * Cada uma das N linhas a seguir contém dois valores inteiros x (10 ≤ x ≤ 100)
 * e y (10 ≤ y ≤ 100) que indicam o tamanho dos dois bambus utilizados para construir a pipa.
 *
 * Saída
 * Para cada caso de teste de entrada, imprima um valor inteiro (desconsiderando a parte decimal)
 * correspondente a àrea da pipa criada, em cm2, seguido de um espaço e do texto "cm2", sem as aspas.
 */

import java.util.Scanner;

public class URI1585FazendoPandorgas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {

            int x = input.nextInt();
            int y = input.nextInt();
            int area = (x * y) / 2;

            System.out.println(String.format("%d cm2", area));
        }

        input.close();
    }
}
