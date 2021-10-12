package urijudge.desafios.iniciante;
/**
 * Ultimamente, diversas pessoas estão indo à Dra. Cláudia Café com Leite para saber se
 * estão consumindo a quantidade recomendada diária de vitamina C.
 * Isso tem a deixado exausta, e por isso ela lhe pediu para escrever um programa que,
 * dado o consumo diário de alimentos ricos em vitamina C por uma pessoa,
 * indique o quanto essa pessoa deve consumir a mais ou a menos para atingir o recomendado.
 *
 * Para tal, você poderá utilizar a tabela a seguir:
 *         sucodelaranja(120),
 *         morangofresco(85),
 *         mamao(85),
 *         goiabavermelha(70),
 *         manga(56),
 *         laranja(50),
 *         brocolis(34);
 *
 * Considere que o consumo diário recomendado de vitamina C está entre 110 mg e 130 mg, inclusive.
 *
 * Entrada
 * Cada caso de teste é composto um inteiro T (1 ≤ T ≤ 7) indicando que a pessoa
 * consome diariamente T alimentos entre os 7 alimentos da tabela.
 * Em seguida, haverá T linhas com um inteiro N e um alimento (totalmente em caixa baixa e sem acentuações),
 * indicando que a pessoa consome uma quantidade N daquele alimento. A entrada termina com T = 0.
 *
 * Saída
 * Para cada caso de teste (T), se o consumo ultrapassou o limite recomendado,
 * imprima "Menos X mg", em que X representa a quantidade a menos a ser consumida para
 * atingir o limite recomendado; se o consumo não atingiu o recomendado,
 * imprima "Mais X mg", em que X representa a quantidade a mais para atingir o recomendado;
 * se o consumo está dentro do intervalo recomendado, imprima "X mg",
 * em que X representa a quantidade consumida diariamente pela pessoa.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = 1;
        while (T != 0) {
            T = sc.nextInt();

            if (T != 0) {

                int totalVitC = 0;
                for (int i = 0; i < T; i++) {
                    int qtde = sc.nextInt();
                    String nomeAlimento = sc.nextLine().replace(" ", "");
                    Alimento alimento = Alimento.valueOf(nomeAlimento);
                    totalVitC += alimento.vitC * qtde;
                }
                if (totalVitC < 110) {
                    System.out.printf("Mais %d mg\n", (110 - totalVitC));
                } else if (totalVitC > 130) {
                    System.out.printf("Menos %d mg\n", (totalVitC - 130));
                } else { // 110 > totalVitC < 130
                    System.out.printf("%d mg\n", totalVitC);
                }
            }
        }
        sc.close();
    }

    enum Alimento {

        sucodelaranja(120),
        morangofresco(85),
        mamao(85),
        goiabavermelha(70),
        manga(56),
        laranja(50),
        brocolis(34);

        private int vitC;

        Alimento(int vitC) {
            this.vitC = vitC;
        }
    }

}
