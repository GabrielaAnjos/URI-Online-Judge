package urijudge.desafios.iniciante;
/**
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
 *
 * Leia o salário do funcionário e calcule e mostre o novo salário,
 * bem como o valor de reajuste ganho e o índice reajustado, em percentual.
 *
 * Entrada
 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 *
 * Saída
 * Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste
 * e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

import java.util.Scanner;
// import java.text.DecimalFormat;

public class URI1048AumentoDeSalario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double ganho, novoSalario;
        int percentual;

        if (salario <= 400){
            ganho = salario * 0.15;
            percentual = 15;
        } else if (salario > 400 && salario <= 800){
            ganho = salario * 0.12;
            percentual = 12;
        } else if (salario > 800 && salario <= 1200){
            ganho = salario * 0.10;
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000){
            ganho = salario * 0.07;
            percentual = 7;
        } else {
            ganho = salario * 0.04;
            percentual = 4;
        }

        novoSalario = salario + ganho;

        System.out.println(String.format("Novo salario: %.2f", novoSalario));
        System.out.println(String.format("Reajuste ganho: %.2f", ganho));
        System.out.println(String.format("Em percentual: %d %%", percentual));

//        System.out.println("Novo salario: " + df.format(novoSalario));
//        System.out.println("Reajuste ganho: " + df.format(ganho));
//        System.out.println("Em percentual: " + percentual + " %");

        input.close();

    }
}
