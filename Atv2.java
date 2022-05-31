import java.util.Scanner;

    public class Atv2 {
        public static void main(String[] args) {
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        System.out.println("Informe o seu Nome: ");

        Scanner in = new Scanner( System.in );

        String nome = in.next();

        System.out.println("Olá, " + nome);
        }
    }