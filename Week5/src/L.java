import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num = 0, soma, i, j;
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            do {
                num = num + 1;
                soma = 0;
                for (j = 1; j < num; j++) {
                    if (num % j == 0) {
                        soma = soma + j;
                    }
                }

            } while (num != soma);
            System.out.println(num);
        }
    }
}