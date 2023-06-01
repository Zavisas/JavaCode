package LacosJava;

import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num = sc.nextInt();
        
        String ast = "*";
        for (int i = 0; i < num; i++){
            System.out.println(ast);
            ast += "*";
            
        }

    }


       

    }
    

