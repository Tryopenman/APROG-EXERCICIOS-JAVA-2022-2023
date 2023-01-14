import java.util.Scanner;

public class Y {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num,i,contador=0;
        num= input.nextInt();
        for (i=1;i<=num;i++){
            if (num%i==0){
                if (i%3==0){
                    contador=contador+1;
                    System.out.println(i);
                }
            }
            }
        if (contador==0){
            System.out.println("without dividers multiples of 3");
        }
        }
    }
