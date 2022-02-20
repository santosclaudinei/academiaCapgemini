import javax.swing.*;

public class Questao02 {

    // Realiza a leitura, validação e ajustes da senha (se necesssário)
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Informe uma senha com no minimo 6 caracteres: ");
        int tamanhoSenha = senha.length();

        if(senhaRecomendada(senha)) {
            System.out.println("A sua senha possuí " + tamanhoSenha + " Caracteres.");
            System.out.println("" + senha);
        } else if (tamanhoSenha >= 3){
            senha += "@4N";
            if (senhaRecomendada(senha)) {
                System.out.println("A sua senha possuí " + senha.length() + " Caracteres.");
                System.out.println("Ela foi incrementada com caracteres que a " +
                        "tornasse mais segura. E ficou: " + senha);
            }

        }   else {
            System.out.println("Caracteres informados são insuficientes para cadastrar a senha.");
        }

    }

    // Verifica se a senha possui todos os elementos de uma senha forte
    public static boolean senhaRecomendada(String senha) {

        boolean possuiNumero = false;
        boolean possuiMaiuscula = false;
        boolean possuiMinuscula = false;
        boolean possuiSimbolo = false;

        for (char caractere : senha.toCharArray()) {

            if (caractere >= '0' && caractere <= '9') {
                possuiNumero = true;
            } else if (caractere >= 'A' && caractere <= 'Z') {
                possuiMaiuscula = true;
            } else if (caractere >= 'a' && caractere <= 'z') {
                possuiMinuscula = true;
            } else {
                possuiSimbolo = true;
            }

        }
        return possuiNumero && possuiMaiuscula && possuiMinuscula && possuiSimbolo;

    }

}
