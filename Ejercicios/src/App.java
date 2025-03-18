import java.util.Scanner;
//Ejercicio 1
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();
        if (num1>num2) {
            double suma = num1 + num2;
            System.out.println(" El resultado de la suma es: " + suma);
            double resta = num1 - num2;
            System.out.println(" El resultado de la resta es: " + resta);
        }else{
            double multi = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + multi);
            double division = num1 / num2;
            System.out.println("El resultado de la division es: " + division);
        }

    }
}