package urijudge.desafios.iniciante;
/**
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
 *
 * Saída
 * Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, stop=1;

        while (stop != 0){
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == 0 || y == 0){
                stop = 0;
            } else {
                if (x > 0 && y > 0){
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0){
                    System.out.println("segundo");
                } else if (x < 0 && y < 0){
                    System.out.println("terceiro");
                } else if (x > 0 && y < 0){
                    System.out.println("quarto");
                }
            }
        }
        sc.close();
    }
}
