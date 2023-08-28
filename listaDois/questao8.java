package listaDois;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0.0;

        if (salarioBruto <= 900.0) {ir = 0.0;}
        else if (salarioBruto <= 1500.0) {ir = (salarioBruto * 5.0) / 100.0;}
        else if (salarioBruto <= 2500.0) {ir = (salarioBruto * 10.0) / 100.0;}
        else {ir = (salarioBruto * 20.0) / 100.0;}

        double inss = (salarioBruto * 10.0) / 100.0;
        double fgts = (salarioBruto * 11.0) / 100.0;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (R$" + valorHora + " * " +
                horasTrabalhadas + "): R$ " + salarioBruto);
        System.out.println("(-) IR (" + (int) (ir / salarioBruto * 100) +
                "%): R$ " + ir);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
