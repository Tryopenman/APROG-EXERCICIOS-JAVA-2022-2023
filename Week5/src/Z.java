import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num,algarismo,maiorImpare = 0;
        double percentagem,contadorPares=0,contadorImpares=0,algarismosTotais=0;
        num= input.nextInt();
        while (num>0){
            algarismo= num%10;
            algarismosTotais=algarismosTotais+1;
            if (algarismo%2==0){
                contadorPares=contadorPares+1;
            }else{
                contadorImpares=contadorImpares+1;
                if (algarismo>maiorImpare) {
                    maiorImpare=algarismo;
                }
        }
            num=num/10;
        }
        percentagem=contadorPares / algarismosTotais*100;
        System.out.printf("%.2f%%%n",percentagem);
        if (contadorImpares==0){
            System.out.println("no odd digits");
        }else {
            System.out.println(maiorImpare);
        }
    }
}
