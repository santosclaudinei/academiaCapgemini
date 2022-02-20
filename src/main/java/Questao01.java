import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {

    // Cria uma lista e adciona o número de espaços e asteriscos numa linha
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> escada = new ArrayList<>();

        System.out.print("Digite a quantidade de vezes: ");
        int tamanhoEscada = entrada.nextInt();

        for (int i = 0; i < tamanhoEscada; i++) {
            escada.add(" ".repeat(tamanhoEscada - (i+1)) + "*".repeat(i + 1));
        }

        for (String degraus : escada) {
            System.out.println(degraus);
        }

    }

}
