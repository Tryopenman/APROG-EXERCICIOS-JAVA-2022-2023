import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num,n,numRepetido,position1,position2,algarismo,algarismo2;
        num= input.nextInt();
        numRepetido=num;
        boolean algarismoRepetido;
        while (numRepetido>=0){
            algarismoRepetido= false;
            position1=0;
            do {
                position1=position1+1;
                algarismo=num%10;
                num=num/10;
                position2=0;
                n=numRepetido;
                do {
                    algarismo2=n%10;
                    n=n/10;
                    position2=position2+1;
                    if (algarismo==algarismo2 && position1!=position2){
                        algarismoRepetido=true;
                        System.out.println(numRepetido +" : digit (" + algarismo + ") repeated in positions (" + position1 + ") and (" + position2 + ")");
                    }
                }while (n!=0 && (!algarismoRepetido));
            }while (num!=0 && (!algarismoRepetido));
            num= input.nextInt();
            numRepetido=num;
        }
    }
}
