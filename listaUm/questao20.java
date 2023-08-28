package listaUm;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("+ Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + ir);
        System.out.println("- INSS (8%): R$" + inss);
        System.out.println("- Sindicato (5%): R$" + sindicato);
        System.out.println("= Salário Líquido: R$" + salarioLiquido);
    }
}
