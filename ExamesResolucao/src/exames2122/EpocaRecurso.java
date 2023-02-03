package exames2122;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EpocaRecurso {

    static final int MAX_MESES = 6;

    static final int COLUNAS = 4;

    public static void readInformationFromFile (String[] meses, int[][] jogos) throws FileNotFoundException {

        int quantmeses = 0;

        String fileName = "xadrez1a6.txt";

        File file = new File(fileName);

        Scanner ler = new Scanner(file);

        while(ler.hasNextLine()){

            String line = ler.nextLine();

            String [] itens = line.split(",");

            meses[quantmeses] = itens[0];

            for (int jogo = 0, item = 1; item < itens.length; jogo++, item++){

                jogos[quantmeses][jogo] = Integer.parseInt(itens[item]);
            }

            quantmeses++;
        }
        ler.close();
    }

    public static String getTheMostVictoriousMonth(String[] meses, int [][] jogos){

        String mesMaiorPercentagem = " ";

        double percentagemVitoriasMax = 0;

        for (int i = 0; i < meses.length; i++){

            double percentagemVitorias = (double) ((jogos[i][1] / jogos [i][0]) * 100);

            if (percentagemVitorias > percentagemVitoriasMax){

                mesMaiorPercentagem = meses[i];

                percentagemVitoriasMax = percentagemVitorias;

            }
        }
        return mesMaiorPercentagem;
    }

    public static double[] getAverages (int[][] jogos){

        double[] average = new double[COLUNAS];

        double soma = 0;

        for (int i = 0; i < COLUNAS; i++){

            for (int j = 0; j < MAX_MESES ; j++){

                soma = soma + jogos[j][i];

            }
            average[i] = soma /MAX_MESES;
        }
        return average;
    }
    public static void writeStatistics (String[] meses , int [][] jogos){

        double[] average = getAverages(jogos);

        System.out.printf("Meses com mais de %.1f jogos \n" ,average[0]);

        for (int i = 0; i < MAX_MESES; i++){

            if (jogos[i][0] > average[0]){

                System.out.printf(meses[i] + " : " + jogos[i][0] + "\n");
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException{

        String [] meses = new String[MAX_MESES];

        int[][] jogos = new int[MAX_MESES][COLUNAS];

        readInformationFromFile(meses,jogos);

        System.out.println(getTheMostVictoriousMonth(meses,jogos));

        getAverages(jogos);

        writeStatistics(meses,jogos);

    }
}
