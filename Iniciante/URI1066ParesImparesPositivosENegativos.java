package urijudge.desafios.iniciante;
/**
 * Leia 5 valores Inteiros.
 * A seguir mostre quantos valores digitados foram pares,
 * quantos valores digitados foram ímpares, quantos valores digitados
 * foram positivos e quantos valores digitados foram negativos.
 *
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 *
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha,
 * não esquecendo o final de linha após cada uma.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int impar = 0, par = 0, pos = 0, neg = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if (num % 2 != 0){
                impar++;
            } else {
                par++;
            }

            if (num > 0){
                pos++;
            } else if (num < 0){
                neg++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

        sc.close();

    }
}
