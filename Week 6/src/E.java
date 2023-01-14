import java.util.Scanner;

public class E {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N, i, numero1, numero2, maiorComuns = 0, numero22 = 0, numero11 = 0;
        N = input.nextInt();
        for (i = 1; i <= N; i++) {
            numero1 = input.nextInt();
            numero2 = input.nextInt();
            if (maiorComuns <= quantAlgarismo(numero1, numero2)) {
                maiorComuns = quantAlgarismo(numero1, numero2);
                numero22 = numero2;
                numero11 = numero1;
            }
        }
        if (maiorComuns > 1) {
            System.out.println(numero11 + "/" + numero22);
        } else {
            System.out.println("no results");
        }
    }

    public static int quantAlgarismo(int num1, int num2) {
        int quantadorAlgarismos = 0, algarismo1, algarismo2;
        while (num1 > 0 && num2 > 0) {
            algarismo1 = num1 % 10;
            num1 = num1 / 10;
            algarismo2 = num2 % 10;
            num2 = num2 / 10;
            if (algarismo2 == algarismo1) {
                quantadorAlgarismos = quantadorAlgarismos + 1;
            }
        }
        return quantadorAlgarismos;
    }
}
