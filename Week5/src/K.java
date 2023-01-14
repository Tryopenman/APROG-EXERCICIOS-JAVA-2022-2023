import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i,j;
        num = input.nextInt();
        for (i = 2; i <= num; i++) {
            int contador = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador = contador + 1;
                }
            }
                if (contador == 2) {
                    System.out.println(i);
                    }
        }
    }
}

