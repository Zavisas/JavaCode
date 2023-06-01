package LacosJava;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.println("======================");
        System.out.println("|      NEGATIVOS     |");
        System.out.println("======================");
        System.out.println("");
        System.out.println("Digite 5 valores: ");

        //ler valores do usuario

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        System.out.println("Valores negativos!");

        //Verifica valores negativos

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                System.out.println(valores[i]);

            }
        }
    }
}

      /*  System.out.print("Digite o 1° numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2° numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3° numero: ");
        int n3 = sc.nextInt();
        System.out.print("Digite o 4° numero: ");
        int n4 = sc.nextInt();
        System.out.print("Digite o 5° numero: ");
        int n5 = sc.nextInt();

        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            if (negativos < 0) {
                System.out.println("NEGATIVOS!" + negativos);

            }
        }
    }
}*/