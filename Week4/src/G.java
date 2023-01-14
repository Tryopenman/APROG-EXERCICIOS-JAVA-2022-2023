import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,divisor,contador;
        num = input.nextInt();
        divisor=0;
        contador=0;
        while(divisor<=num) {
            divisor= divisor +1;
            if (num % divisor==0) {
                contador= contador +1;
                System.out.println(divisor);
            }
        }
        System.out.println("("+contador+")");
    }
}