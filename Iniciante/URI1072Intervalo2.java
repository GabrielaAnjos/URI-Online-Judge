package urijudge.desafios.iniciante;
/**
 * Leia um valor inteiro N.
 * Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20]
 * e quantos estão fora do intervalo, mostrando essas informações.
 *
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N (N < 10000),
 * que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 *
 *
 * Saída
 * Para cada caso, imprima quantos números estão dentro (in)
 * e quantos valores estão fora (out) do intervalo.
 */

import java.util.Scanner;

public class URI1072Intervalo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num;
        int in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num >= 10 && num <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();

    }
}
