package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Exerc {
    public static void main(String[] args) {
        int numero = 0;
        Scanner escolha = new Scanner(System.in);
        while (numero != 3){
            System.out.println("Escolha a opção:");
            System.out.println("1 - Calcular Imposto");
            System.out.println("2 - Depositar Salário");
            System.out.println("3 - Sair");
            numero = escolha.nextInt();
        }
        System.out.println("Valeu e Falou");
    }
}
