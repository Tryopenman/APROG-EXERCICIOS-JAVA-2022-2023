import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num, alg;
        double percentagemMax = 0;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        int N = n;
        while (N > 0) {
            double contDivisiveis = 0, contAlg = 0, percentagem;
            N -= 1;
            num = ler.nextInt();
            int numero = num;
            while (num > 0) {
                alg = num % 10;
                num /= 10;
                contAlg += 1;
                if (alg != 0) {
                    if (numero % alg == 0) {
                        contDivisiveis += 1;
                    }
                }
            }
            percentagem = (contDivisiveis / contAlg) * 100;
            if (percentagemMax < percentagem)
                percentagemMax = percentagem;
            System.out.printf("%.2f%%%n", percentagem);
        }
        if (n > 0) {
            System.out.printf("(%.2f%%)%n", percentagemMax);
        }
    }
}
