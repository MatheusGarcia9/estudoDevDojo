package academy.devdojo.javacore.Aintroclasses.test;

import academy.devdojo.javacore.Aintroclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Matheus";
        professor.idade = 28;
        professor.sexo = 'M';
        System.out.println("Nome: "+ professor.nome + " Idade: " +professor.idade + " Sexo: "+ professor.sexo);

    }
}
