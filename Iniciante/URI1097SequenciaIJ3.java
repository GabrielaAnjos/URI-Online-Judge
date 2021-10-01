package urijudge.desafios.iniciante;
/**
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=9
 * I=3 J=8
 * I=3 J=7
 * ...
 * I=9 J=15
 * I=9 J=14
 * I=9 J=13
 */

import java.util.Scanner;

public class URI1097SequenciaIJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1, j=7;
        while (i <= 9){
            for (int k = 0; k < 3; k++) {
                System.out.printf("I=%d J=%d\n", i, j);
                j--;
            }
            j+=5;
            i+=2;
        }

        sc.close();
    }
}
