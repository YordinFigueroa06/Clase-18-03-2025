import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        }else{
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
