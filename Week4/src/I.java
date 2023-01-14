import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1, num2,minimoMultiplo,maiorDivisor = 1;
        num1= input.nextInt();
        num2= input.nextInt();
        for (int i=1; i<=num1 && i<=num2;i++ ) {
            if(num1 % i ==0 && num2 % i==0) {
                maiorDivisor = i;
            }
        }
        minimoMultiplo = (num1*num2) / maiorDivisor;
        System.out.println(minimoMultiplo);
    }
}
