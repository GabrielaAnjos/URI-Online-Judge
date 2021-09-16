package urijudge.desafios.iniciante;
/**
 * Leia um valor inteiro, que é o tempo de duração em segundos de um
 * determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N.
 *
 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos),
 * convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.util.Scanner;

public class URI1019_ConversaoDeTempo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // segundos

        int horas = N / 3600;
        N = N % 3600;

        int minutos = N / 60;
        N = N % 60;

        int segundos = N;

        System.out.println(horas + ":" + minutos + ":" + segundos);
//        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
//        System.out.printf(String.format("%d:%d:%d\n", horas, minutos, segundos));

        input.close();
    }
}
