import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num= input.nextInt();
        while (num>100 || num<1){
            num= input.nextInt();
        }
        System.out.println("triples=" + somaTripla(num));
    }
    public static int somaTripla(int numero){
        int contador=0;
        for (int i=numero-2;i>0;i--){
            for (int j=i;j>0;j--){
                for (int k=j;k>0;k--){
                    if (numero==i+j+k){
                        System.out.println(i + " + " + j + " + " + k);
                        contador=contador+1;
                    }
                }
            }
        }
        return contador;
    }
}
