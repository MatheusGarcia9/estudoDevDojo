package academy.devdojo.javacore.Bintrometodos.test;

import academy.devdojo.javacore.Bintrometodos.dominio.Estudante;
import academy.devdojo.javacore.Bintrometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Matheus";
        estudante01.idade = 28;
        estudante01.sexo = 'M';

        estudante02.nome = "Luana";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("----------------- ");
        estudante02.imprime();
    }
}
