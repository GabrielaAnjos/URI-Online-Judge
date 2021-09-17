package urijudge.desafios.iniciante;
/**
 * Leia a hora inicial e a hora final de um jogo.
 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar
 * em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 *
 * Entrada
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 *
 * Saída
 * Apresente a duração do jogo conforme exemplo abaixo.
 */

import java.util.Scanner;

public class URI1046_TempoDeJogo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int duracao;

        if (horaInicial > horaFinal){
            duracao = 24 - (horaInicial - horaFinal);
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        input.close();
    }
}
