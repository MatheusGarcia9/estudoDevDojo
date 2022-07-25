package academy.devdojo.intro.estruturascondicionais.ifelse;

public class ExSala {
    public static void main(String[] args) {
        float salario = 5000.00f;
        float resultado = 0f;
        String porcentagem = "";
        if (salario > 4500){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        }else{
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("Valor final em porcentagem de "+porcentagem+" é de "+resultado);
    }
}
