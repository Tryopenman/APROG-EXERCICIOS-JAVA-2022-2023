import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,sec,maiorAno=0;
        double contadorTotal=0, contadorBissextos=0,percentagem=1;
        num=input.nextInt();
        while(num>999 && num<10000){
            contadorTotal=contadorTotal+1;
            if ((num%4==0 && num%100!=0)||num%400==0){
                contadorBissextos=contadorBissextos+1;
                sec=num/100+1;
                System.out.println("ano bissexto = " + num + " século = " + sec);
                if (sec==20 && num>maiorAno){
                    maiorAno=num;
                }
            }
            num= input.nextInt();
        }
        percentagem=contadorBissextos/contadorTotal*100;
        if (contadorBissextos>0){
            System.out.printf("percentagem de bissextos inseridos = " + "%.2f%%%n",percentagem);
            System.out.println("maior ano bissexto do século 20 = " + maiorAno);
        }else {
            System.out.println("não foi inserido qualquer ano bissexto");
        }
    }
}