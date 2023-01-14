import java.util.Scanner;

public class F {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String solido;
        double raio, altura, volume;
        solido = input.nextLine();
        while (!solido.equals("end")) {
            if (solido.equals("cone")) {
                raio = input.nextDouble();
                altura = input.nextDouble();
                volume = cone(raio, altura);
                System.out.printf("%.2f%n", volume);

            }
            if (solido.equals("cylinder")) {
                raio = input.nextDouble();
                altura = input.nextDouble();
                volume = cilindro(raio, altura);
                System.out.printf("%.2f%n", volume);

            }
            if (solido.equals("sphere")) {
                raio = input.nextDouble();
                volume = esfera(raio);
                System.out.printf("%.2f%n", volume);

            }
            solido = input.nextLine();
        }

    }

    public static double cone(double raio1, double altura1) {
        double volumeCone;
        volumeCone = ((Math.PI * Math.pow(raio1,2) * altura1) / 3);
        return volumeCone;
    }

    public static double cilindro(double raio2, double altura2) {
        double volumeCilindro;
        volumeCilindro = Math.PI * Math.pow(raio2,2) * altura2;
        return volumeCilindro;
    }

    public static double esfera(double raio3) {
        double volumeEsfera;
        volumeEsfera = ((4 * Math.PI * Math.pow(raio3, 3)) / 3);
        return volumeEsfera;
    }
}
