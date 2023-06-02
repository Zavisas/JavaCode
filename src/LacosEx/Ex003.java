import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("| CONTADOR DE NOME |");
        System.out.println("====================");
        System.out.println("");


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Insira um numero: ");
        int number = sc.nextInt();

        for (int i = 0; i< number; i++){

            System.out.println(nome);
        }
    }
    
}
