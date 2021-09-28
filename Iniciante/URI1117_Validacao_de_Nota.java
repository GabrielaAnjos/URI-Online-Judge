package urijudge.desafios.iniciante;
/**
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas
 * (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
 *
 * Entrada
 * A entrada contém vários valores reais, positivos ou negativos.
 * O programa deve ser encerrado quando forem lidas duas notas válidas.
 *
 * Saída
 * Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem
 * "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
 */

import java.util.Scanner;

public class URI1117_Validacao_de_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1=-1, nota2=-1;

        // Nota 1
        while (nota1 < 0 || nota2 > 10){
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10)
                System.out.println("nota invalida");
        }
        while (nota2 < 0 || nota2 > 10){
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10)
                System.out.println("nota invalida");
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}
