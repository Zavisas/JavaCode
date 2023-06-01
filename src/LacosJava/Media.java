package LacosJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList();
        double media = 0;

        System.out.println("----------------------------");
        System.out.println("|    DESCUBRA SUA MEDIA     |");
        System.out.println("----------------------------");

        System.out.println("Digite a Quantidade de notas: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Digite a " + i + " nota: ");
            int valor = sc.nextInt();
            valores.add(valor);

        }

        for (int valor : valores) {
            media = media + valor;
        }

        System.out.printf("A sua media foi de %.1f", (media / qtd));

        if (media >= 7) {
            System.out.println();
            System.out.println("Aprovado!");
        }
        if (media <= 5.5) {
            System.out.println();
            System.out.println("Reprovado!");
        }
    }
}