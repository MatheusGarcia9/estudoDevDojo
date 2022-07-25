package academy.devdojo.javacore.Aintroclasses.test;

import academy.devdojo.javacore.Aintroclasses.dominio.Carro;

public class ExerCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Gol";
        carro.modelo = "Confortline";
        carro.ano = 2017;

        carro = carro2;

        carro2.nome = "Parati";
        carro2.modelo = "GLI";
        carro2.ano = 2007;

        System.out.println("Primeiro Carro = " +carro.nome + " Qual o Modelo: " +carro.modelo + " Ano: " +carro.ano);
        System.out.println("Segundo Carro = " +carro2.nome + " Qual o Modelo: " +carro2.modelo + " Ano: " +carro2.ano);
    }
}
