package academy.devdojo.intro.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ExerDiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual dia da semana é hoje?");
        int dia = input.nextInt();
        if (dia == 1) {
            System.out.println("Segunda");
        } else if (dia == 2){
            System.out.println("Terca");
        } else if (dia == 3){
        System.out.println("Quarta");
        } else if (dia == 4){
            System.out.println("Quinta");
        } else if (dia == 5){
            System.out.println("Sexta");
        } else if (dia == 6){
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        }else {
            System.out.println("Dia inválido");
    }
}
}