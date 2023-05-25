import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class saoNegativos {
    public static void main(String[] args) {
        main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° valor: ");
        System.out.println("Digite o 1° valor: ");
        int v1 = sc.nextInt();
        System.out.println("Digite o 2° valor: ");
        int v2 = sc.nextInt();
        System.out.println("Digite o 3° valor: ");
        int v3 = sc.nextInt();

        int cont = 0;

        if (v1 < 0) {
            cont++;
        }
        if (v2 < 0) {
            cont++;
        }
        if (v3 < 0) {
            cont++;
        }
        System.out.println(cont + " Sao negativos!");
        }

    }

