package academy.devdojo.javacore.Bintrometodos.test;

import academy.devdojo.javacore.Bintrometodos.dominio.Funcionario;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{1250, 1630.35, 1500};

        funcionario.infoTrabaiado();
        funcionario.mediaSalario();
    }
}
