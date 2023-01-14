import java.util.Scanner;
import java.lang.Math;
public class F {
    public static void main(String[] args) {
        int num, num1, algarismo, ordem, n;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        num1 = num;
        n = num;
        ordem = 0;
        int num2 = 0;
        while (num1 > 0) {
            num1 = num1 / 10;
            ordem = ordem + 1;
        }
        while (ordem > 0) {
            algarismo = n % 10;
            n= n / 10;
            num2 = (int) (num2 + algarismo * Math.pow(10, ordem - 1));
            ordem = ordem - 1;
        }
        if (num2 == num) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
