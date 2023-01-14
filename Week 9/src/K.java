import java.util.Scanner;

public class K {
    static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N=input.nextInt();
        int arrNumero[]= new int[N];
        lerNumeros(arrNumero);
        ordenarNumeros(arrNumero);
    }
    public static void lerNumeros(int[] arrNumero){
        for (int i =0;i< arrNumero.length;i++) {
            arrNumero[i] = input.nextInt();
        }
    }
    public static void ordenarNumeros(int[] arrNumero){
        for (int i=0;i< arrNumero.length-1;i++){
            boolean repetido=false;
            for(int j=0;j<arrNumero.length&&j!=i;j++){
                if (arrNumero[i] == arrNumero[j]){
                    repetido=true;
                }
            }
            if (repetido==false){
                System.out.println(arrNumero[i]);
            }
        }
    }
}
