import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        double nota;
        do {
            System.out.print("Informe uma nota (-1 para encerrar): ");
            nota = scanner.nextDouble();
            
            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);

        if (notas.isEmpty()) {
            System.out.println("Nenhum valor foi informado.");
        } else {
            System.out.println("Quantidade de valores lidos: " + notas.size());
            
            System.out.print("Valores na ordem em que foram informados: ");
            for (double n : notas) {
                System.out.print(n + " ");
            }
            
            System.out.println("\nValores na ordem inversa: ");
            for (int i = notas.size() - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }

            double soma = 0;
            for (double n : notas) {
                soma += n;
            }

            double media = soma / notas.size();
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);

            int acimaDaMedia = 0;
            int abaixoDeSete = 0;

            for (double n : notas) {
                if (n > media) {
                    acimaDaMedia++;
                }
                if (n < 7) {
                    abaixoDeSete++;
                }
            }

            System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
            System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
