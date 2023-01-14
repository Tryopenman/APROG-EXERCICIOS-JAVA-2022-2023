import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num, soma = 0;
        //System.out.println("Número: ");
        num= input.nextInt();
        while(num>0) {
            int algarismo = num % 10;

            if(algarismo % 2 == 0){
                soma += algarismo;
            }
            num = num / 10;
        }
        System.out.println(soma);
    }

}
