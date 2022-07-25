package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03ExerLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login = "entrar";
        String senha = "entrou";
        System.out.println("Login: ");
        String loginUsuario = input.nextLine();

        System.out.println("Senha: ");
        String senhaUsuario = input.nextLine();

        while (true) {
            if ((loginUsuario.equals(login)) && (senhaUsuario.equals(senha))) {
                System.out.println("Acesso Condecido");
                break;

            } else {
                System.out.println("Acesso Negado");
            }
        }

    }
}
