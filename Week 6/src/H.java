import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =12, contador1 =1, contador2 = 0;
        while (!palindrome(num) && contador1 <= 5) {
            contador1++;
            num = input.nextInt();
            if (palindrome(num)) {
                System.out.println("palindrome");
                contador2 = contador2 + 1;
            }
        }
        if (contador2==0) {
            System.out.println("attempts exceeded");
        }
    }
    public static boolean palindrome(int num) {
        int algarismo, soma = 0;
        int num1 = num;
        boolean palindromeVef = false;
        while (num > 0) {
            algarismo = num % 10;
            soma = (soma * 10) + algarismo;
            num = num / 10;
        }
        if (num1 == soma) {
            palindromeVef = true;
        }
        return palindromeVef;
    }
}