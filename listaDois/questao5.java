package listaDois;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maior, menor;

        // Inicializamos as variáveis maior e menor com o primeiro número
        maior = menor = numero1;

        // Comparamos com o segundo número
        if (numero2 > maior) {
            maior = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }

        // Comparamos com o terceiro número
        if (numero3 > maior) {
            maior = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
