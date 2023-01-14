import java.util.Scanner;

public class C {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N = input.nextInt();
        int numeros[] = new int[N];
        for (int i = 0; i < N; i++) {
            numeros[i] = input.nextInt();
        }
        System.out.println("always ascending = " + crescente(numeros, N));
    }

    public static boolean crescente(int numeros[], int N) {
        boolean arrayCrescente = false;
        int anterior = numeros[0];
        for (int i = 1; i < N; i++) {
            if (anterior < numeros[i]) {
                anterior = numeros[i];
                arrayCrescente = true;
            }else{
                return false;
            }
        }
        return arrayCrescente;
    }
}
