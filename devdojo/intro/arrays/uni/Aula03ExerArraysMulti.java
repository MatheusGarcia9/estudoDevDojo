package academy.devdojo.intro.arrays.uni;

import java.util.Scanner;

public class Aula03ExerArraysMulti {
    public static void main(String[] args) {
        int[] v1 = new int [5];
        int[] v2 = new int [5];
        int[] v3 = new int [5];
        Scanner input = new Scanner(System.in);
        String resultados = "";
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1, posição " +i + ":");
            v1 [i] = input.nextInt();
            System.out.println("Vetor 2, posição " +i + ":");
            v2 [i] = input.nextInt();
            v3 [i] = v1[i] * v2[i];
            resultados = resultados + v3[i];
        }
        System.out.println(resultados);
    }
}