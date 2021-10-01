package urijudge.desafios.iniciante;
/**
 *Leia quatro valores inteiros A, B, C e D.
 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
 * segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 *
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
 * com um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class URI1007_Diferenca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int DIFERENCA;
        DIFERENCA = (A*B-C*D);

        System.out.println(String.format("DIFERENCA = %d", DIFERENCA));

        input.close();
    }
}
