package urijudge.desafios.iniciante;
/**
 * I=0 J=1
 * I=0 J=2
 * I=0 J=3
 * I=0.2 J=1.2
 * I=0.2 J=2.2
 * I=0.2 J=3.2
 * .....
 * I=2 J=?
 * I=2 J=?
 * I=2 J=?
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double i=0, j=1;

        while (i <= 2) {
            for (int k = 0; k < 3; k++) {
                if (i == 0.0 || i == 1.0 || i > 1.8) { // i == (int)i não funciona neste programa
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                }
                j++;
            }
            j-=3;
            j+=0.2;
            i+=0.2;
        }
        sc.close();
    }
}
