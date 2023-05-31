package LacosJava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int num;
        int res;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("===| BEM-VINDO A TABUADA VIRTUAL! |===");
        System.out.println("======================================");

    System.out.println(" Digite um numero: ");
        num = sc.nextInt();

        while (contador <= 10){
            res = num * contador;

            System.out.println(num + " X " + contador + " = " + res);

            contador++;


            }
            sc.close();
        }
    }

