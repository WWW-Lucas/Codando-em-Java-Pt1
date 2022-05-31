import java.util.Scanner;

    public class Atv7 {
        public static void main(String[] args) {
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 
            
        System.out.println("Informe um Numero: ");
        
        Scanner in = new Scanner( System.in );

        int n1 = in.nextInt(); 

        System.out.println("Informe outro Numero: ");

        int n2 = in.nextInt();

        System.out.println("Informe um Numero: ");

        int n3 = in.nextInt();

        if (n1 > n2 & n2 > n3){
            int result = n1 + n2;
            System.out.println("A SOMA ENTRE OS NUMEROS "+n1+" E " +n2+ " RESULTA EM " +result);
        } else if (n1 > n2 & n3 > n2) {
            int result = n1 + n3;
            System.out.println("A SOMA ENTRE OS NUMEROS "+n1+" E " +n3+ " RESULTA EM " +result);
        } else if (n2 > n1 & n3 > n1) {
            int result = n2 + n3;
            System.out.println("A SOMA ENTRE OS NUMEROS "+n2+" E " +n3+ " RESULTA EM " +result);
        }
    }
}
