import java.util.Scanner;

public class H {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N=input.nextInt();
        int[] arrNumero= new int[N];
        lerNumeros(N,arrNumero);
        String comando= input.nextLine();
        while(!comando.equals("exit")) {
            if (comando.equals("right")){
                sequenciaRight(arrNumero,N);
            }
            if (comando.equals("left")) {
                sequenciaLeft(arrNumero,N);
            }
            comando= input.next();
        }
    }
    public static void lerNumeros(int N,int[] arrNumero){
        for (int quantNum=0;quantNum<N;quantNum++) {
            arrNumero[quantNum] = input.nextInt();
        }
    }
    public static void sequenciaRight(int[] arrNumero,int N){
        int auxiliar=arrNumero[N-1];
        for (int i=N-1;i>0;i--){
            arrNumero[i]=arrNumero[i-1];
        }
        arrNumero[0]=auxiliar;
        for (int j=0;j<N;j++){
            System.out.print("[" + arrNumero[j] + "]");
        }
        System.out.println();
    }
    public static void sequenciaLeft(int[] arrNumero,int N){
        int auxiliar2 = arrNumero[0];
        for (int i=0;i<N-1;i++){
            arrNumero[i]=arrNumero[i+1];
        }
        arrNumero[N-1]=auxiliar2;
        for (int i = 0; i < N; i++) {
            System.out.print("[" +arrNumero[i] + "]");
        }
        System.out.println();
    }
}
