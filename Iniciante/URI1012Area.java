package urijudge.desafios.iniciante;
/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
 * Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 *
 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o ponto decimal.
 *
 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados.
 * Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
 * O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.util.Scanner;

public class URI1012Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double aTriangulo = (a * c) / 2.0;
        double aCirculo = 3.14159 * (Math.pow(c,2));
        double aTrapezio = ((a + b) * c) / 2.0;
        double aQuadrado = b * b;
        double aRetangulo = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", aTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", aCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", aTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", aQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", aRetangulo));

        input.close();
    }
}
