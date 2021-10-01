package urijudge.desafios.iniciante;
/**
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 *
 * Perimetro = XX.X
 *
 * Em caso negativo, calcule a área do trapézio que tem
 * A e B como base e C como altura, mostrando a mensagem
 *
 * Area = XX.X
 *
 * Entrada
 * A entrada contém três valores reais.
 *
 * Saída
 * O resultado deve ser apresentado com uma casa decimal.
 */

import java.util.Scanner;

public class URI1043Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if ((A + B > C) && (A + C > B) && (B + C > A)){
            double perimetro = A + B + C;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            double areaTrapezio = ((A + B) * C) / 2;
            System.out.println(String.format("Area = %.1f", areaTrapezio));
        }

        input.close();
    }
}
