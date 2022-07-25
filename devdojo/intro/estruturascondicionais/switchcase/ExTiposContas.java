package academy.devdojo.intro.estruturascondicionais.switchcase;

import java.util.Scanner;

public class ExTiposContas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual tipo de Conta: Digite 1 - Poupança 2 - Corrente 3 - Investimento");
        int conta = input.nextInt();
        System.out.println("Qual valor depositado");
        double valor = input.nextDouble();
        switch (conta) {
            case 1: System.out.println("Poupança tem 0.05% de juros");
                System.out.println("Seu depóstio vai render no primeiro mês " + (valor * 0.0005));
                break;
            case 2: System.out.println("Conta Corrente tem 0.02% de juros");
                System.out.println("Seu depóstio vai render no primeiro mês = " + (valor * 0.0002));
                break;
            case 3:
                System.out.println("Conta Investimento tem 0.1% de juros");
                System.out.println("Seu depóstio vai renderno primeiro mês  " + (valor * 0.001));
                break;
            default:
                System.out.println("Caso nao possuir conta, falar com gerente");
        }

    }
}
