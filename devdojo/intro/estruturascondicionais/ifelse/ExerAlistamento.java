package academy.devdojo.intro.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ExerAlistamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sexo: ");
        String sexo = input.next();
        System.out.println("Idade: ");
        int idade = input.nextInt();
        if (sexo.equalsIgnoreCase("m") && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo.equalsIgnoreCase("m") && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else if (sexo.equalsIgnoreCase("f") && idade < 18) {
            System.out.println("Alistamento não permitido!");
        }

    }
}
