package academy.devdojo.intro.variaveis;

public class CalculadoraSalario {
    public static void main (String[] args){
        float salario = 2000.00F;
        float desconto = 30;
        float descontoSalario = desconto/100;
        float valorDesconto = salario * descontoSalario;
        float salarioAposDesconto = salario - valorDesconto;
        System.out.println("Salario Apos desconto = " + salarioAposDesconto);
    }
}

