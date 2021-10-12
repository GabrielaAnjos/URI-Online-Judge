package urijudge.desafios.iniciante;
/**
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se
 * estes valores foram digitados em ordem crescente ou decrescente.
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.
 * A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
 *
 * Saída
 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido
 * digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, stop=1;

        while (stop != 0){
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == y){
                stop = 0;
            } else {
                stop = 1;
                if (x > y){
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }
            }
        }
        sc.close();
    }
}
