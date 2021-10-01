package urijudge.desafios.iniciante;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Após, calcule e mostre o valor a ser pago.
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados.
 * Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 *
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 * O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.util.Scanner;

public class URI1010CalculoSimples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cod1 = input.nextInt();
        int num_pecas1 = input.nextInt();
        double valor_unit1 = input.nextDouble();

        int cod2 = input.nextInt();
        int num_pecas2 = input.nextInt();
        double valor_unit2 = input.nextDouble();

        double total = (num_pecas1 * valor_unit1) + (num_pecas2 * valor_unit2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        input.close();
    }
}
