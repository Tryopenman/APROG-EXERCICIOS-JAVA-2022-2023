import java.util.Scanner;

public class D {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N = input.nextInt();
        int notasAlunos[] = new int[N];
        int notas[] = new int[21];
        inserirNotas(notasAlunos, N);
        frequencia(notasAlunos, N, notas);
        for (int i = 0; i < 21; i++) {
            System.out.println(i + " " + notas[i]);
        }
    }
    public static void inserirNotas(int notasAlunos[],int N){
        for (int i=0;i<N;i++){
            notasAlunos[i]= input.nextInt();
        }
    }
    public static void frequencia(int notasAlunos[],int N,int notas[]){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 21; j++) {
                if (notasAlunos[i] == j && notas[j] == 0) {
                    notas[j] = 1;
                } else if (notasAlunos[i] == j && notas[j] != 0) {
                    notas[j]=notas[j]+1;
                }
            }
        }
    }
}


