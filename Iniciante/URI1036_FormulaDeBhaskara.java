package urijudge.desafios.iniciante;
/**
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
 * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
 * caso haja uma divisão por 0 ou raiz de numero negativo.
 *
 * Entrada
 * Leia três valores de ponto flutuante (double) A, B e C.
 *
 * Saída
 * Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
 * Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto,
 * com uma mensagem correspondente conforme exemplo abaixo.
 * Imprima sempre o final de linha após cada mensagem.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1036_FormulaDeBhaskara {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r2;

        double delta = (b * b) - (4.0 * a * c);

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
            return;
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        }

        input.close();
    }
}
