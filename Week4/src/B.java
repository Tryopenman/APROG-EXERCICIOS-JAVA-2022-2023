import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,soma;
        //System.out.println("Número: ");
        num= input.nextInt();
        while(num>0){
            soma = 0;
            do {
                int algarismo = num % 10;
                num = num / 10;

                if (algarismo % 2 == 0) {
                    soma += algarismo;
                }
            }while(num!=0);
            System.out.println(soma);
            num= input.nextInt();
        }
    }
}

