package listaDois;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Atleta: ");
        String nomeAtleta = scanner.nextLine();
        ArrayList<Double> saltos = new ArrayList<Double>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Salto " + i + ": ");
            double salto = scanner.nextDouble();
            saltos.add(salto);}

        // Encontra o melhor e o pior salto
        double melhorSalto = Collections.max(saltos);
        double piorSalto = Collections.min(saltos);

        // Remove o melhor e o pior salto da lista
        saltos.remove(melhorSalto);
        saltos.remove(piorSalto);

        // Calcula a média dos demais saltos
        double soma = 0;
        for (double salto : saltos) {soma += salto;}
        double media = soma / saltos.size();

        System.out.println("\nMelhor salto: " + melhorSalto + " m");
        System.out.println("Pior salto: " + piorSalto + " m");
        System.out.println("Média dos demais saltos: " + media + " m");

        System.out.println("\nResultado:");
        System.out.println(nomeAtleta + ": " + media + " m");
    }
}
