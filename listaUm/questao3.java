package listaUm;
import java.text.DecimalFormat;

public class questao3 {
    public static void main(String[] args) {
        double numero = 5.67;
        double resultado = numero * 3;
        DecimalFormat formato = new DecimalFormat("0.00");
        String resultadoFormatado = formato.format(resultado);
        System.out.println("Resultado: " + resultadoFormatado);
    }
}
