import java.util.Scanner;

public class A {
    public static int contaralgarismo(int numero){
        int quant= 1;
        while (numero>9){
            numero=numero/10;
            quant=quant+1;
        }
        return (quant);
    }
    public static void main(String[] args) {
        int n,soma=0,x,fim=5;
        double media,contador=0;
        Scanner input =new Scanner(System.in);
        n= input.nextInt();
        do {
            x= input.nextInt();
            if (contaralgarismo(x)<n) {
                soma = soma + x;
                contador = contador + 1;
            }
        }while (contaralgarismo(x)<n && contador<fim);
        if (contador>0) {
            media = soma / contador;
            System.out.printf("%.2f%n", media);
        }else{
            System.out.println("0.00");
        }
    }
}
