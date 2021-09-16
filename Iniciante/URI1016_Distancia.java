package urijudge.desafios.iniciante;
/**
 * Dois carros (X e Y) partem em uma mesma direção.
 * O carro X sai com velocidade constante de 60 Km/h
 * e o carro Y sai com velocidade constante de 90 Km/h.
 *
 * Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X,
 * ou seja, consegue se afastar um quilômetro a cada 2 minutos.
 *
 * Leia a distância (em Km) e calcule quanto tempo leva (em minutos)
 * para o carro Y tomar essa distância do outro carro.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro.
 *
 * Saída
 * Imprima o tempo necessário seguido da mensagem "minutos".
 */

import java.util.Scanner;

public class URI1016_Distancia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        int tempo = (60 * distancia) / 30;

        System.out.println(tempo + " minutos");

        input.close();
    }
}
