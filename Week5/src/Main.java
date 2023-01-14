import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num,numIntroduzidos=0,maior20sec=0,seculo=0;
        double pernumBi=0;
        num=read.nextInt();
        while (numeroDeAlgarismos(num)==4 ) {

            if (num < 2000 && num > 1899) {
                seculo = 20;
            }
            if (num < 2100 && num > 1999) {
                seculo = 21;
            }
            if (num % 400 == 0) {
                pernumBi++;
                System.out.print("ano bissexto = " + num + " ");
                System.out.print("seculo = " + seculo);
                if (num < 2000 && num > 1899) {
                    maior20sec = num;
                }
            } else {
                if (num % 4 == 0 && num % 100 != 0) {
                    pernumBi++;
                    System.out.print("ano bissexto = " + num + " ");
                    System.out.print("seculo = " + seculo);
                    if (num < 2000 && num > 1899) {
                        maior20sec = num;
                    }
                }
            }

            numIntroduzidos++;
            num = read.nextInt();
        }
        if (numIntroduzidos> 0) {
            pernumBi = (pernumBi/numIntroduzidos)*100;
            System.out.printf("%.2f%%%n",pernumBi);

        }else{
        System.out.println("nao foi inserido qualquer ano bissexto");
        }
        System.out.println("maior ano bissexto do Seculo 20 = "+maior20sec);
        }
    public static int numeroDeAlgarismos(int num){
        int numdig;
        numdig =1;
        while(num >9){
            num= num/10;
            numdig++;
        }
        return numdig;
    }
    }




