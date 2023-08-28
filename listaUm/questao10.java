package listaUm;

public class questao10 {
    public static void main(String[] args) {
        double saldo = 500.50;
        double deposito = 300.25;
        double saque = 150.75;

        saldo += deposito;
        saldo -= saque;
        System.out.println("Saldo atual: " + saldo);
    }
}
