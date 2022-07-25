package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula02ExerTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual número quer saber a tabuada");
        int numero = input.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(numero*i);
        }

        }
    }
