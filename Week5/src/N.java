import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num2= 0,algarismo1,numRepetido,algarismo2;
        num = input.nextInt();
        boolean verify;
        if (num >=0){
            num2= input.nextInt();
        }
        while (num>=0 && num2 >= 0) {
            while (num2>0 && num2<10) {
                if (num < num2) {
                    System.out.println(num2);
                    num = num2;
                }
                num2= input.nextInt();
            }
            if (num2>=10 || num2==0){
                while (num2==0 || num2>=10){
                    numRepetido= num2;
                    verify= true;
                    if (num<num2) {
                        do {
                            algarismo1 =num2 %10;
                            num2=num2/10;
                            algarismo2= num2%10;
                            num2=num2/10;
                            if (algarismo2 > algarismo1) {
                                verify = false;
                            }
                        }while (algarismo2<algarismo1 &&num2>0);
                        if (verify && algarismo2!=algarismo1){
                            if (algarismo2!=0){
                                System.out.println(numRepetido);
                            }
                        }
                    }
                    num=numRepetido;
                    num2= input.nextInt();
                }
            }
        }
    }
}
