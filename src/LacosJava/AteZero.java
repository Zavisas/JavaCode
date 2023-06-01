package LacosJava;

import java.util.Scanner;

public class AteZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|===== JOGO DE AZAR=====|");
        System.out.println("=========================");
        System.out.println("");
        
        System.out.println("Digite um numero: ");

        int i = 0;
        do{
        i = sc.nextInt();   
        } while (i != 0);

        // int i = 1;
        // while(i != 0){
        //     i = sc.nextInt();
        // }
        
        System.out.println("Voce Perdeu :( ");
    }
}
    

