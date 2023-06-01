package LacosJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList();

        System.out.println("======================");
        System.out.println("|      NEGATIVOS     |");
        System.out.println("======================");
        System.out.println("");
        System.out.println("Digite um numero de valores: ");
        int v = sc.nextInt();


        for (int i = 1; i <= v; i++) {
            System.out.println("Digite a " + i + " valor: ");
            int valor = sc.nextInt();
            valores.add(valor);
        }

        for (int valor : valores) {
            if (valor < 0) {
                System.out.println("Negativos | " + valor + " |");


            }

        }
    }
}