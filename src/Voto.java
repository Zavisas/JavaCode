import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();


        if (idade < 16) {
            System.out.println("Voce nao pode votar ainda, :) ");
            
        } else if (idade >= 16 && idade >= 70) {
            System.out.println("Seu voto é facultativo!");
            
        } else if (idade >= 18 && idade < 70) {
            System.out.println("Seu voto é obrigatório! :( ");
            
        }

    }
}


