package Page1_CondicionaisVariaveis;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        exercicio1();

    }

    private static void exercicio1() {
        Scanner leitura = new Scanner(System.in);

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;

        System.out.println("|==== SOMA DE 3 VALORES JAVA =====| \n");

        System.out.println("=================================");
        System.out.print("         Digite um 1° valor: ");
        valor1 = leitura.nextInt();

        System.out.println("===================================");
        System.out.print("         Digite um 2° valor: ");
        valor2 = leitura.nextInt();

        System.out.println("===================================");
        System.out.print("          Digite um 3° valor: ");
        valor3 = leitura.nextInt();

        int res = valor1 + valor2 + valor3;
        System.out.println("======== RESULTADO =========");
        System.out.println(res);

    }
}