package listaDois;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        System.out.println("Responda às seguintes perguntas (sim ou não):");

        //perguntas
        System.out.print("Telefonou para a vítima? ");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.print("Esteve no local do crime? ");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.print("Mora perto da vítima? ");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.print("Devia para a vítima? ");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(scanner.nextLine().toLowerCase());

        int sim = 0;
        for (String resposta : respostas) {
            if (resposta.equals("sim")) {
                sim++;
            }
        }

        String classificacao;
        if (sim == 2) {classificacao = "Suspeita";}
        else if (sim >= 3 && sim <= 4) {classificacao = "Cúmplice";}
        else if (sim == 5) {classificacao = "Assassino";}
        else {classificacao = "Inocente";}

        System.out.println("\nClassificação: " + classificacao);
        scanner.close();
    }
}
