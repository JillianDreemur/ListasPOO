package listaDois;
import java.util.Scanner;

public class questao17 {
    public static double valorPagamento(double prestacao, int diasAtraso) {
        if (diasAtraso == 0) {
            return prestacao; //sem atraso n muda nada
        } else {
            //com atraso tem multa
            double multa = prestacao * 0.03;
            double juros = prestacao * 0.001 * diasAtraso;
            return prestacao + multa + juros;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrestacoes = 0;
        double totalValorPago = 0.0;

        System.out.println("Calculadora de Pagamento de Prestações");

        while (true) {
            System.out.print("Informe o valor da prestação (ou 0 para encerrar): ");
            double prestacao = scanner.nextDouble();

            if (prestacao == 0) {break;}

            System.out.print("Informe o número de dias de atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorPago = valorPagamento(prestacao, diasAtraso);
            System.out.println("Valor a ser pago: R$" + valorPago);

            totalPrestacoes++;
            totalValorPago += valorPago;
        }

        // Exibe o relatório do dia
        System.out.println("\nRelatório do Dia:");
        System.out.println("Total de prestações pagas: " + totalPrestacoes);
        System.out.println("Valor total pago: R$" + totalValorPago);

        scanner.close();
    }
}
