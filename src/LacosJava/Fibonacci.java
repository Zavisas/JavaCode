package LacosJava;

public class Fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
    
    System.out.println("                FIBONACCI                  ");
    System.out.println("===========================================");
    System.out.println("");
    
	// teste do programa. Imprime os 1000 primeiros termos
	for (int i = 0; i < 1000; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

    }

}