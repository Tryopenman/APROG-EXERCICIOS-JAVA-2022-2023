import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b;
        a= input.nextInt();
        b=input.nextInt();
        if (a>=b){
            System.out.println("C(" + a + "," + b +")=" + calcularComb(a,b));
            System.out.println("P(" + a + "," + b +")=" + calcularPerm(a,b));
        }
    }
    public static int calcualarFatorial(int f){
        int fatorial=1;
        while (f>1){
            fatorial=fatorial*f;
            f--;
        }return (fatorial);
    }
    public static int calcularPerm(int a1,int b1){
        int permutacoes;
        permutacoes= calcualarFatorial(a1)/calcualarFatorial(a1-b1);
        return permutacoes;
    }
    public static int calcularComb(int a2,int b2){
        int combinacoes;
        combinacoes=calcualarFatorial(a2)/(calcualarFatorial(b2)*calcualarFatorial(a2-b2));
        return  combinacoes;
    }
}
