import java.util.Scanner;

public class G {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N = input.nextInt();
        int[] numero = new int[N];
        for (int i = 0; i < N; i++) {
            numero[i] = input.nextInt();
        }
        numerosContrario(numero, N);
    }

    public static void numerosContrario(int numero[], int N) {
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
