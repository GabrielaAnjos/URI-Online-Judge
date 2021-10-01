package urijudge.desafios.iniciante;
/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
 * e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 *
 * Entrada
 * A entrada é composta por vários casos de testes contendo valores inteiros.
 *
 * Saída
 * Para cada valor lido mostre a mensagem correspondente à descrição do problema.
 */

import java.util.Scanner;

public class URI1114SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, stop=1;

        while (stop != 0){
            x = sc.nextInt();

            if (x == 2002){
                System.out.println("Acesso Permitido");
                stop = 0;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}
