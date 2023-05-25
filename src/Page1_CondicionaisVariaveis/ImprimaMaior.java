package Page1_CondicionaisVariaveis;

import java.util.Scanner;

public class ImprimaMaior {
    public static void main(String[] args) {
        main();
    }

    public static void main(){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1° valor: ");
        int v1 = ler.nextInt();
        System.out.print("Digite o 2° valor: ");

        int v2 = ler.nextInt();
        System.out.println(v1);
        System.out.println(v2);

        if (v1 > v2) {
            System.out.println("MAIOR");
        }
        else if (v1 == v2){
                System.out.println("IGUAIS");
            }else {
            System.out.println(v1 + " é MENOR");
        }
        }
    }
