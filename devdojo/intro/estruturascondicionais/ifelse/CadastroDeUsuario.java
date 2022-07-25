package academy.devdojo.intro.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (nome.equalsIgnoreCase ("admin") || nome.equalsIgnoreCase ("administrador")){
            System.out.println("Usuário Inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
