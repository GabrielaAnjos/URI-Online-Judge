package urijudge.desafios.iniciante;
/**
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema,
 * da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido,
 * através das três palavras fornecidas.
 *
 * Entrada
 * A entrada contém 3 palavras, uma em cada linha, necessárias para
 * identificar o animal segundo a figura, com todas as letras minúsculas.
 *
 * Saída
 * Imprima o nome do animal correspondente à entrada fornecida.
 */

import java.util.Scanner;

public class URI1049Animal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String palavra1 = input.next();
        String palavra2 = input.next();
        String palavra3 = input.next();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba"); // onivoro
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")){
                if (palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else { // herbivoro
                    System.out.println("vaca");
                }
            }
        } else {
            if (palavra2.equalsIgnoreCase("inseto")){
                if (palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else { // herbivoro
                    System.out.println("lagarta");
                }
            } else if (palavra2.equalsIgnoreCase("anelideo")){
                if (palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else { // onivoro
                    System.out.println("minhoca");
                }
            }
        }

        input.close();
    }
}
