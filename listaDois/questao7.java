package listaDois;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 280.0) {percentualAumento = 20.0;}
        else if (salarioAtual <= 700.0) {percentualAumento = 15.0;}
        else if (salarioAtual <= 1500.0) {percentualAumento = 10.0;}
        else {percentualAumento = 5.0;}

        valorAumento = (percentualAumento / 100.0) * salarioAtual;
        novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
    }
}
