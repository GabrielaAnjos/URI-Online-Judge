package urijudge.desafios.iniciante;
/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item
 * e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * Entrada
 * O arquivo de entrada contém dois valores inteiros correspondentes ao código
 * e à quantidade de um item conforme tabela acima.
 *
 * Saída
 * O arquivo de saída deve conter a mensagem "Total: R$ "
 * seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int qtde = input.nextInt();
        double total = 0;

        switch (codigo){
            case 1:
                total = qtde * 4.0; // cachorro quente
                break;
            case 2:
                total = qtde * 4.50; // x-salada
                break;
            case 3:
                total = qtde * 5.0; // x-bacon
                break;
            case 4:
                total = qtde * 2.0; // torrada simples
                break;
            case 5:
                total = qtde * 1.50; // refrigerante
                break;
            }

        System.out.println(String.format("Total: R$ %.2f", total));

        input.close();
    }
}
