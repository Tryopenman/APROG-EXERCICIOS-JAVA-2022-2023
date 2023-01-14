import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int N;
        N= input.nextInt();
        for (int i = 0; i<=N; i++){
            if (numAmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean numAmstrong(int num){
        boolean amstrong=false;
        int contAlgarismos=0,num1,soma=0,algarismo,num2;
        num1=num;
        num2=num;
        while (num>0){
            num=num/10;
            contAlgarismos=contAlgarismos+1;
        }
        while (num1>0){
            algarismo=num1%10;
            num1=num1/10;
            soma+=Math.pow(algarismo,contAlgarismos);
        }
        if (num2==soma){
            amstrong= true;
        }
        return amstrong;
    }

}

