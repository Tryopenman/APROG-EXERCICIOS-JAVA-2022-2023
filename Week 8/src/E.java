import java.util.Scanner;

public class E {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeFunc[] = new String[20];
        double vencimentoFunc[] = new double[20];
        int contador = contar(vencimentoFunc,nomeFunc);
        double media= calcmedia(vencimentoFunc,contador);
        nomeFunc[contador] = input.nextLine();
        System.out.printf("%.1f%n",media);
        escreverAbaixo(vencimentoFunc,nomeFunc,contador,media);

    }

    private static void escreverAbaixo(double[] vencimentoFunc, String[] nomeFunc, int contador, double media) {
        for(int i=0;i<contador;i++){
            if (vencimentoFunc[i]<media){
                System.out.println(nomeFunc[i]);
            }
        }
    }

    private static double calcmedia(double[] vencimentoFunc, int contador) {
        double soma=0;
        double media=1;
        for (int i=0;i<contador;i++){
            soma=soma + vencimentoFunc[i];
        }
        media= soma/contador;
        return media;
    }

    private static int contar(double[] vencimentoFunc, String[] nomeFunc) {
        int contador=0;
        nomeFunc[contador]= input.nextLine();
        while(!nomeFunc[contador].equals("end")) {
            if (!nomeFunc[contador].equals("end")) {
                vencimentoFunc[contador] = input.nextDouble();
                contador++;
                input.nextLine();
            }
            nomeFunc[contador] = input.next();
        }
        return contador;
    }
}