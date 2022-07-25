    package academy.devdojo.intro.arrays.multi;

    import java.util.Scanner;

    public class Aula03ExercicioArraysMulti {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[4][4];
//        arrayMult1 [0][0] = 22;
//        arrayMult1 [0][1] = 11;
//        arrayMult1 [0][2] = 54;
//        arrayMult1 [1][0] = 44;
//        arrayMult1 [1][1] = 55;
//        arrayMult1 [1][2] = 76;
        Scanner input = new Scanner(System.in);
        int resultado = 1;
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("Digite o valor da posição ["+i+"]["+j+"]");
                arrayMult1 [i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                if (i==j){
                    resultado = resultado * arrayMult1[i][j];
                }

                System.out.println("Resultado: "+resultado);
        }

        }
    }
    }
