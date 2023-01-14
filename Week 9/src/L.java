import java.util.Scanner;

public class L {

    static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        int arrNumeros[]= new int[50];
        int cont=0;
            numero= input.nextInt();
            while(numero>0) {
                arrNumeros[cont]=numero;
                numero= input.nextInt();
                cont++;
            }
            verifcarVizinhos(arrNumeros,cont);
        }

    private static void verifcarVizinhos(int[] arrNumeros,int cont) {
        for (int i=1;i<cont-1;i++){
            if (arrNumeros[i-1]<arrNumeros[i] && arrNumeros[i]>arrNumeros[i+1]){
                System.out.println(arrNumeros[i]);
            }
        }
    }
}