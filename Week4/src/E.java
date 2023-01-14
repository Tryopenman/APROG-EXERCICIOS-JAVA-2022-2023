import java.util.Scanner;
import java.lang.Math;
public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDecimal, numOctal,expoente,algarismo;
        numOctal= input.nextInt();

        while(numOctal>0){
            expoente=0;
            numDecimal=0;
            while (numOctal>0) {
                algarismo= numOctal % 10;
                numOctal = numOctal / 10;
                numDecimal= (int) (numDecimal+ algarismo * Math.pow(8, expoente));
                expoente = expoente+1;
            }
            System.out.println(numDecimal);
            numOctal= input.nextInt();
        }
    }
}
