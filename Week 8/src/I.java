import java.util.Scanner;

public class I {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int numPisos=4;
        int numEntradas=3;
        String[][] nomesProprietarios= new String[numEntradas][numPisos];
        lerNomes(nomesProprietarios,numEntradas,numPisos);
        mostrarPisoEntrada(nomesProprietarios,numEntradas,numPisos);
    }
    private static void mostrarPisoEntrada(String[][] nomeProprietario, int numEntradas, int numPisos) {
        boolean existe = false;
        String nome = input.nextLine();
        for (int entradas= 0; entradas < numEntradas; entradas++) {
            for (int pisos = 0; pisos < numPisos; pisos++) {
                if (nomeProprietario[entradas][pisos].equals(nome)) {
                    System.out.println("name=" + nomeProprietario[entradas][pisos]);
                    System.out.println("entrance=" + entradas);
                    System.out.println("floor=" + pisos);
                    existe = true;
                }
            }
        }
        if (!existe) {
            System.out.println("Do not live in the building");
        }
    }
    private static void lerNomes(String[][] nomeProprietario, int numEntradas, int numPisos) {
        for (int entradas = 0; entradas < numEntradas; entradas++) {
            for (int pisos = 0; pisos < numPisos; pisos++) {
                nomeProprietario[entradas][pisos] = input.nextLine();
            }
        }
    }
}

