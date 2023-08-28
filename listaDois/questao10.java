package listaDois;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada (de 1 a 10): ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número fora do intervalo permitido.");}
        else {
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }
    }
}
