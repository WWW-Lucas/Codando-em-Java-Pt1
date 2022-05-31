import java.util.Scanner;

    public class Atv5 {
        public static void main(String[] args) {
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

        System.out.println("Informe um Numero: ");
        
        Scanner in = new Scanner( System.in );

        int numero = in.nextInt();

        if (numero >= 1) {
            System.out.println("O NUMERO INFORMADO E POSITIVO.");
        } else if (numero < 0){
            System.out.println("O NUMERO INFORMADO E NEGATIVO.");
        } else {
            System.out.println("O NUMERO INFORMADO E IGUAL A ZERO.");
        }
    }
}
