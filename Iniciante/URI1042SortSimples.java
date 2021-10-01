package urijudge.desafios.iniciante;
/**
 * Leia 3 valores inteiros e ordene-os em ordem crescente.
 * No final, mostre os valores em ordem crescente, uma linha em branco
 * e em seguida, os valores na sequência como foram lidos.
 *
 * Entrada
 * A entrada contem três números inteiros.
 *
 * Saída
 * Imprima a saída conforme foi especificado.
 */

import java.util.Scanner;

public class URI1042SortSimples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a < b && a < c){
            System.out.println(a);
            if (b < c){
                System.out.println(b);
                System.out.println(c);
            } else { // c < b
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b < c){
            System.out.println(b);
            if (a < c){
                System.out.println(a);
                System.out.println(c);
            } else { // c < a
                System.out.println(c);
                System.out.println(a);
            }
        } else { // c < a e c < b
            System.out.println(c);
            if (a < b){
                System.out.println(a);
                System.out.println(b);
            } else { // b < a
                System.out.println(b);
                System.out.println(a);
            }
        }

        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        input.close();

    }
}
