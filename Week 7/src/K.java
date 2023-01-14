import java.util.Scanner;

public class K {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero, total = 0, algarismo,algarismo2=0;
        numero = input.nextInt();
        numero= numInvertido(numero);
        while (numero > 0) {
            algarismo = numero % 10;
            numero = numero / 10;
            total=calcSoma(algarismo,algarismo2,total);
            algarismo2=algarismo;
        }
        System.out.println("points=" + total);
    }

    public static boolean facesVer(int n1, int n2) {
        boolean nIguais = false;
        if (n1 == n2) {
            nIguais = true;
        }
        return nIguais;
    }

    public static int calcSoma(int algarismo1, int algarismo2, int soma) {
        if (!facesVer(algarismo1, algarismo2)) {
            soma = soma + algarismo1;
        } else if (facesVer(algarismo1, algarismo2) && algarismo2 != 0) {
            if (soma > 0) {
                soma = -soma - algarismo1;
            } else {
                soma = soma - algarismo1;
            }
        }
        return soma;
    }
    public static int numInvertido(int num) {
        int numInvertido = 0;
        while (num > 0) {
            int alg = num % 10;
            num /= 10;
            numInvertido = (numInvertido * 10) + alg;
        }
        return numInvertido;
    }
}
