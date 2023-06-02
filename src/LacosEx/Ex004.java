import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("|   CONTADOR INTELIGENTE  |");
        System.out.println("===========================");
        
        System.out.print("Insira um numero: ");
        int number = sc.nextInt();

        for(int i = 0; i <number; i++){
            System.out.print("Insira um valor: ");
            int num = sc.nextInt();
        }
    

        int soma = 0;
        for (int i = 0; i < 10; i++){
            soma = soma + i;
        }
        
        System.out.println("A soma dos valores é " + soma);

    }   
}