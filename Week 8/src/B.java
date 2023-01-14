import java.util.Scanner;

public class B {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 10, numero, contador = 0;
        int numeros[] = new int[max];
        do {
            numero = input.nextInt();
            if (numero >= 0) {
                numeros[contador] = numero;
                contador = contador + 1;
            }
        }while (numero>=0);
        if (contador>0) {
            System.out.println("min=" + menor(numeros, contador));
            System.out.println("occurrences=" + repeticoes(numeros, contador, menor(numeros, contador)));
        }
    }

    public static int menor(int numeros[], int contador) {
        int menorNumero;
        menorNumero = numeros[0];
        for (int i=0; i<contador;i++){
            if (numeros[i]<=menorNumero){
                menorNumero=numeros[i];
            }
        }
        return menorNumero;
    }
    public static int repeticoes(int numeros[],int contador,int menor){
        int contador1=0;
        for (int i=0;i<contador;i++){
            if(numeros[i]==menor){
                contador1=contador1+1;
            }
        }
        return contador1;
    }
}
