package academy.devdojo.javacore.Bintrometodos.test;

import academy.devdojo.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumero(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumero(20,0));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
