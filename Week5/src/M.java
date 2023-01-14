import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num,n,num1=0,num2=1,i;
        num= input.nextInt();
            if (num==1){
                System.out.println("0");
            }else if (num==2){
            System.out.println("0");
            System.out.println("1");
            }else if (num!=0){
                System.out.println("0");
                System.out.println("1");
                for (i=2;i<num;i++){
                    n=num1+num2;
                    System.out.println(n);
                    num1=num2;
                    num2=n;
                }
            }
        }
    }

