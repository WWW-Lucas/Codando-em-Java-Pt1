import java.util.Scanner;

    public class Atv6 {
        public static void main(String[] args) {
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
        
        System.out.println("Informe um Numero: ");
        
        Scanner in = new Scanner( System.in );

        int n1 = in.nextInt(); 

        System.out.println("Informe outro Numero: ");

        int n2 = in.nextInt();

        System.out.println("Informe um Numero: ");

        int n3 = in.nextInt();

        if (n1 > n2 & n1 > n3){
            System.out.println("O NUMERO " +n1+ " E MAIOR");
        } else if (n2 > n1 & n2 > n3) {
            System.out.println("O NUMERO "+n2+" E MAIOR");
        } else {
            System.out.println("O NUMERO "+n3+ " E MAIOR");
        }
    }
}
