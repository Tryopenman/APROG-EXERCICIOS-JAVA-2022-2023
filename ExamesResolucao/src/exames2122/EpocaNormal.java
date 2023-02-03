package exames2122;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EpocaNormal {

    static final String FILENAME = "musics.txt";
    public static String findMostExpensiveMusic (String[] musics, double [] [] info){

        int posicao = 0;

        double preco = 0;

        for (int i = 0; i <info.length; i++){

            if (info[i][1] >= preco){

                posicao = i;

                preco = info[i][1];
            }
        }
        String findMostExpensiveMusic = musics[posicao];

        return findMostExpensiveMusic;
    }

    public static void sort (String[] musics, double [][] info){

        for (int i = 0; i < musics.length -1; i++ ){

            for (int j = i + 1; j < musics.length; j++){

                if (info[i][0] > info[j][0]){

                    double auxiliarTempo = info[i][0];

                    double auxiliarPreco = info[i][1];

                    String auxiliarNome = musics[i];

                    info[i][0] = info[j][0];

                    info[i][1] = info [j][1];

                    info[j][0] = auxiliarTempo;

                    info[j][1] = auxiliarPreco;

                    musics[i] = musics[j];

                    musics[j] = auxiliarNome;
                }
                if (info[i][0] == info[j][0] && musics[i].compareTo(musics[j]) > 0){

                    double auxiliarTempo = info[i][0];

                    double auxiliarPreco = info[i][1];

                    String auxiliarNome = musics[i];

                    info[i][0] = info[j][0];

                    info[i][1] = info[j][1];

                    info[j][0] = auxiliarTempo;

                    info[j][1] = auxiliarPreco;

                    musics[i] = musics[j];

                    musics[j] = auxiliarNome;
                }
            }
        }
    }
    public static double calculateBiggestDifference(double [][] info){

        double maiorDiferenca = info[info.length-1][0] - info [0][0];

        return maiorDiferenca;
    }

    public static void writeToFile (String[] musics, double[][] info) throws FileNotFoundException{

        File file = new File(FILENAME);

        PrintWriter guardar = new PrintWriter(file);

        for (int i = 0; i < musics.length; i++){

            guardar.printf(musics[i] + " / " + "%.2fs / %.2f€", info[i][0], info[i][1]);

            guardar.println();
        }
        guardar.close();
    }

    public static void main(String[] args) throws FileNotFoundException{

        String[] musics = {"On my way" ,"Memories" , "Perfect","Havana"};

        double[][] info = {{201.6 , 3.25} , {189 , 2.80} ,{256.8 , 2.75} , {202.8,2.35}};

        System.out.println(findMostExpensiveMusic(musics,info));

        sort(musics,info);

        System.out.printf("%.2fs", calculateBiggestDifference(info));

        writeToFile(musics,info);
    }
}

