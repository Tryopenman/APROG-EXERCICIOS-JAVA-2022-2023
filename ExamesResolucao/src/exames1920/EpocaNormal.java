package exames1920;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EpocaNormal {

    static final String FILENAME = "ocupacaoSala2020-01-14.txt";

    static final int FILAS = 24;

    static final int LUGARES = 30;

    static final int QUANTIDADECONSECUTIVOS= 4;

    public static int [][] lerOcupacaoDaSala() throws FileNotFoundException {

        File file = new File(FILENAME);

        Scanner ler = new Scanner(file);

        int [][] arr = new int[FILAS][LUGARES];

        int quantFilas = 0;

        while(ler.hasNextLine()){

            String line = ler.nextLine();

            String[] itens = line.split(";");

            for (int item = 1, lugar = 0; item < itens.length; item++ ,lugar++){

                arr [quantFilas][lugar] = Integer.parseInt(itens[item]);
            }
            quantFilas++;
        }
        ler.close();

        return arr;
    }
    public static int calcularBilheteira (int[][] arr){

        int preco = 0;

        for (int i = 0; i< FILAS ; i++){

            for (int j = 0; j < LUGARES; j++){

                if (i < 8 && arr[i][j] == 1){

                    preco = preco +20;

                } else if (i >= 8 && i < 16 && arr[i][j] == 1) {

                    preco = preco + 15;

                }else if (i >= 16 && arr[i][j] ==1){

                    preco = preco + 10;
                }
            }
        }
        return preco;
    }
    public static int informarLugares (int[][] arr, int lugares){

        int contador = 0;

        for (int i = FILAS - 1; i >= 0; i--){

            for(int j = 0; j < LUGARES; j++){

                if (arr[i][j] == 0){

                    contador++;
                }else {

                    contador = 0;
                }
                if (contador == lugares){

                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)throws FileNotFoundException{

        int [][] lugares;

        lugares= lerOcupacaoDaSala();

        System.out.println("O valor da bilheteira foi de:" + calcularBilheteira(lugares) + "€");

        int lugaresConsecutivos = QUANTIDADECONSECUTIVOS;

        System.out.println(informarLugares(lugares,lugaresConsecutivos));
    }
}