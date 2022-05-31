import java.util.Scanner;

    public class Atv8 {
        public static void main(String[] args) {
        //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
            
        System.out.println("Informe um Numero: ");
        
        Scanner in = new Scanner( System.in );

        double n1 = in.nextInt(); 

        System.out.println("Informe o Segundo Numero: ");

        double n2 = in.nextInt();

            while (n2 == 0){
                System.out.println("O Numero informado não pode ser igual a 0!");
                System.out.println("Informe o Segundo Numero.");
                n2 = in.nextInt();
            }
       
            

            System.out.println("A DIVISAO ENTRE "+n1+" E "+n2+" RESULTA EM: " +(n1 / n2));
    }
}