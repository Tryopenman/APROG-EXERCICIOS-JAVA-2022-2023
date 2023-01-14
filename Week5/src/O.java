import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingredientesAlergicos, ingredientesAlergicos2, nPizzas, menuPizza, menuPizza2, contador = 1;
        int invalidalg1, menupizzaalg1;
        ingredientesAlergicos = sc.nextInt();
        ingredientesAlergicos2 = ingredientesAlergicos;
        nPizzas = sc.nextInt();

        for (int i = 1; i <= nPizzas; i++) {
            menuPizza = sc.nextInt();
            menuPizza2 = menuPizza;
            boolean verify = false;

            do {
                menupizzaalg1 = menuPizza % 10;
                menuPizza = menuPizza / 10;
                ingredientesAlergicos = ingredientesAlergicos2;
                do {
                    invalidalg1 = ingredientesAlergicos % 10;
                    ingredientesAlergicos = ingredientesAlergicos / 10;

                    if (menupizzaalg1 == invalidalg1) {
                       verify= true;
                    }
                } while (ingredientesAlergicos != 0);
            } while (menuPizza != 0);

            if (!verify) {
                System.out.println("Suggestion #" + contador + ":" + menuPizza2);
                contador++;
            }
        }
    }
}