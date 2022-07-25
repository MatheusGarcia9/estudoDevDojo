package academy.devdojo.intro.arrays.uni;

public class Aula01Intro {
    public static void main(String[] args) {
        double[] notas = new double[5];
        System.out.println("----------------------");
        notas[0] = 7.5;
        notas[1] = 8;
        notas[2] = 5;
        notas[3] = 3.5;
        notas[4] = 5.0;
        System.out.println("Tamanho do array:" + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
