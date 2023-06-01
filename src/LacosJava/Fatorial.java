package LacosJava;

import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor:");
    int valor = sc.nextInt();
    int total = valor;

    for(int i = valor-1; i > 1 ; i--){
        total = total * i;

    }
    
    System.out.println("Fatorial igual a " + total);
    }    
}



 // int i = valor;
    // while (i >= 1){
    // total = total *i;
    // i--;