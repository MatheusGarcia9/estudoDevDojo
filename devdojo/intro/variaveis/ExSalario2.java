package academy.devdojo.intro.variaveis;

public class ExSalario2 {
    public static void main (String[] args){
        double salario = 2000.00F;
        double resultado = salario * 0.3;
        System.out.println("Deconto 1 = " + resultado);
        resultado = salario * 0.15;;
        System.out.println("Desconto 2 = " + resultado);
        resultado = salario * 0.05;
        System.out.println("Desconto 3 = " + resultado);
    }
}
