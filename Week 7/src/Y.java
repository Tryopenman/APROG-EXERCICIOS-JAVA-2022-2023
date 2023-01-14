import java.util.Scanner;

public class Y {
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        int N= readPositiveValue();
        int N2=readPositiveValue();
        showTablesInRange(N,N2);
    }
    public static int readPositiveValue(){
        int num=0;
        while(num<=0){
            num=input.nextInt();
        }
        return num;
    }
    public static void showTablesInRange(int num1, int num2) {
        if (num1 > num2) {
            int num3 = num2;
            num2 = num1;
            num1 = num3;
        }
        for (int i = num1; i <= num2; i++) {
            showTableOfNumber(i);
        }
    }
    public static void showTableOfNumber(int numero){
        System.out.println("Multiplication table of " + numero);
        for (int i=1;i<=10;i++){
            int tabuada=numero*i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
}
