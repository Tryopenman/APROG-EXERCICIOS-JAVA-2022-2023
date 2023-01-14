import java.util.Scanner;

public class C{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, produto = 1,impares = 0;
        num= input.nextInt();
        while (num>0) {
            int algarismo = num % 10;
            if (algarismo % 2 != 0) {
                produto = produto * algarismo;
                impares = impares + 1;
            }
            num = num / 10;
        }
        if (impares >0) {
            System.out.println(produto);
        }else {
            System.out.println("no odd digits");
        }
    }
}