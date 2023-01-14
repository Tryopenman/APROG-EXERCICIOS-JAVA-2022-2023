import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (num == 0 || num == 1 || FibonnaciVef(num)) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }
    public static boolean FibonnaciVef(int n) {
        boolean Fibonacci = false;
        if (FibonacciCont(n) == n) {
            Fibonacci = true;
        }
        return Fibonacci;
    }
    public static int FibonacciCont(int numero) {
        int n1 = 0, n2 = 1, n3 = 1;
        while (n2 <= numero - 1) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
