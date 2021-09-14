package urijudge.desafios.iniciante;

/**
 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
 * Para isso, ele gostaria que você o auxiliasse através de um simples programa.
 * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h).
 * Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários.
 * Mostre o valor com 3 casas decimais após o ponto.
 *
 * Entrada
 * O arquivo de entrada contém dois inteiros.
 * O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).
 *
 * Saída
 * Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
 */

import java.util.Scanner;

public class URI1017_GastoDeCombustível {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempo = input.nextInt(); // horas
        int velocidade = input.nextInt(); // km/h

        int qtde_km = tempo * velocidade;
        double qtde_litros = qtde_km / 12.0;

        System.out.printf("%.3f\n", qtde_litros);
//        System.out.println(String.format("%.3f", qtde_litros));

        input.close();
    }
}
