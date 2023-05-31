package LacosJava;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("|    DESCUBRA SUA MEDIA     |");
        System.out.println("----------------------------");

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = nota + nota2/2;

            if (media >= 7 && media <= 10) {
                System.out.println();
                System.out.println("Aprovado!");
            }
               if (media <= 5.5){
                    System.out.println();
                    System.out.println("Reprovado!");

                }
            }
        }

