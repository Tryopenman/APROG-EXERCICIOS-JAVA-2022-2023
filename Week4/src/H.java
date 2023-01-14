import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num, divisor, contador;
        num= input.nextInt();
        divisor=0;
        contador=0;
        while (divisor<=num) {
            divisor= divisor+1;
            if (num % divisor==0){
                contador=contador+1;
            }
        }
        if (contador==2) {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}