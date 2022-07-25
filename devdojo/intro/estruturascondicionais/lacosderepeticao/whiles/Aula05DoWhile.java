package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner input = new Scanner( System.in);
        do {
            System.out.println("Jogador 1: Digite um número de 1 a 10");
            int num1 = input.nextInt();
            System.out.println("Jogador 2: Digite um número de 1 a 10");
            int num2 = input.nextInt();
            System.out.println("Acertou " +(num1 == num2));
            System.out.println("Deseja Continuar Jogando?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            desejaContinuar = input.nextInt();
        } while (desejaContinuar == 1);
    }
}
