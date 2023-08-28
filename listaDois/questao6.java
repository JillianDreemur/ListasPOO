package listaDois;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? (M-matutino / " +
                "V-vespertino / N-noturno): ");
        String turno = scanner.next();

        switch (turno.toLowerCase()) {
            default -> System.out.println("Valor Inválido!");
            case "m" -> System.out.println("Bom Dia!");
            case "v" -> System.out.println("Boa Tarde!");
            case "n" -> System.out.println("Boa Noite!");
        }
    }
}
