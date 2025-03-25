import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre para comparar");
        String primerNombre = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre para comparar");
        String segundoNombre = scanner.nextLine();
        String[] nombres = {primerNombre,segundoNombre};
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println("Nombres ordenados alfabéticamente:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
