import java.util.Scanner;

public class A {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        double media = 1;
        N = input.nextInt();
        int notaAlunos[] = new int[N];
        for (int i = 0; i < N; i++) {
            notaAlunos[i] = input.nextInt();
        }
        media = (double) soma(notaAlunos) / N;
        System.out.printf("average=" + "%.1f%n", media);
        System.out.println("failures=" + negativas(notaAlunos, N));
    }

    public static int soma(int[] notaAlunos) {
        int soma = 0;
        for (int j = 0; j < notaAlunos.length; j++) {
            soma = soma + notaAlunos[j];
        }
        return soma;
    }

    public static int negativas(int[] notaAlunos, int numero) {
        int contador = 0;
        for (int i = 0; i < numero; i++) {
            if (notaAlunos[i] < 10) {
                contador = contador + 1;
            }
        }
        return contador;
    }
}
