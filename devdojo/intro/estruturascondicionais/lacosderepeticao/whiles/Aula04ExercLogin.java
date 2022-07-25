package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercLogin {
    public static void main(String[] args) {
        String login = "entrar";
        String senha = "entrou";
        boolean exibicaoTelaLogin = true;
        Scanner input = new Scanner(System.in);
        while (exibicaoTelaLogin) {
            System.out.println("Login: ");
            String loginUsuario = input.nextLine();
            System.out.println("Senha: ");
            String senhaUsuario = input.nextLine();
            if ((loginUsuario.equals(login)) && (senhaUsuario.equals(senha))) {
                System.out.println("Acesso Condecido");
                exibicaoTelaLogin = false;
                break;
            }
                System.out.println("Acesso Negado");
            }
        }

    }
