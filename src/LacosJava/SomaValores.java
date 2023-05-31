package LacosJava;

import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;

        System.out.println("-----------------------------");
        System.out.println("|  BEM-VINDO AO SOMA VALOR  |");
        System.out.println("-----------------------------");

        System.out.print("Digite o primeiro valor: ");
        int N = sc.nextInt();
        System.out.print("Digite o segundo valor:  ");
        N = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        N = sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        N = sc.nextInt();
        System.out.print("Digite o quinto valor: ");
        N = sc.nextInt();


        S = N * 5;

        System.out.println("A soma dos valores é " +  S);
       }


        }

