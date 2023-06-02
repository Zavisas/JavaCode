import java.util.ArrayList;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("|   SOMADOR DE IDADE   |");
        System.out.println("========================");

        int[] valores = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }


        System.out.println("A soma dos valores é: " + soma);
    }
}

