import java.util.Scanner;

public class F {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double juros[] = new double[7];
        juros[0] = 0;
        for (int i = 1; i < 7; i++) {
            juros[i] = input.nextDouble();
        }
        double depositoInicial = input.nextInt();
        System.out.printf("final value=%.2f%n", valorFinal(depositoInicial, juros));
    }

    public static double valorFinal(double depositoInicial, double juros[]) {
        double total = depositoInicial;
        for (int i = 0; i < 7; i++) {
            total = total + juros[i] * total;
        }
        return total;
    }
}

