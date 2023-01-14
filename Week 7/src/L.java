import java.util.Scanner;

public class L {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String frase;
        frase = input.nextLine();
        System.out.println(palavrasCont(frase));
    }
    public static int palavrasCont(String frase1) {
        int contador = 0;
        char posicao2 = ' ';
        for (int i = 0; i < frase1.length(); i++) {
            char posicao1 = frase1.charAt(i);
            if (posicao1 !=' ' && posicao2 ==' ') {
                contador = contador + 1;
            }
            posicao2 = posicao1;
        }
        return contador;
    }

}

