    package academy.devdojo.intro.arrays.multi;

    import java.util.Scanner;

    public class Aula02InicializandoArraysMulti {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[2][3];
//        arrayMult1 [0][0] = 22;
//        arrayMult1 [0][1] = 11;
//        arrayMult1 [0][2] = 54;
//        arrayMult1 [1][0] = 44;
//        arrayMult1 [1][1] = 55;
//        arrayMult1 [1][2] = 76;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("Digite o valor da posição ["+i+"]["+j+"]");
                arrayMult1 [i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println(" [" + i + "][" + j + "]=" + arrayMult1[i][j]);
        }
        }
    }
    }
