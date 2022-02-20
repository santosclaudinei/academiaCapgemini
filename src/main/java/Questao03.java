import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao03 {

    // Leitura da palavra que iremos verificar quantas substrings são anagramas
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a palavra para checar se as substrings são anagramas: ");
        String palavra = ler.next();
        subString(palavra);

    }

    /* Utilizamos um laço for encadeado para verificar todas as combinacoes/ocorrencias
       e uma estrutura de HashMap para armazenar as combinacoes/ocorrencias  */
    static void subString(String s){

        HashMap<String, Integer> map = new HashMap<>();

        int tamanho = s.length();

        for(int i = 0; i < tamanho; i++){
            for(int j = i; j < tamanho; j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }

        }

        // Utilizamos um laço foreach para checar quais combinacoes possuem 2 ocorrencias
        int paresSubstring = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            paresSubstring += (n * (n-1))/2;
            if (n == 2) {
                System.out.print(key.toUpperCase() + " ");
            }
        }
        System.out.println("são as substrings da palavra " + s.toUpperCase() + "." +
                " Foram encontradas " + paresSubstring + " substrings");

    }

}
