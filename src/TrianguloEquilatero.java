import java.util.Scanner;

public class TrianguloEquilatero {
    public static void main(String[] args) {
        main();
    }

    public static void main(){
        Scanner lerTr = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        lerTr.nextInt();

        System.out.println("Digite o 2° valor:");
        lerTr.nextInt();

        System.out.println("Digite o 3° valor:");
        lerTr.nextInt();

        int l1 = 0, l2 = 0, l3 = 0;

        if (l1 == l2 && (l2 == l3) && l1 == l3) {
            System.out.println("Equilatero!");
        } else {
            System.out.println("Nao é Equilatero!");
        }



    }
}
